package csz.mdm.controllers;

import com.hand.hap.system.service.IProfileService;
import csz.mdm.components.MdmFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import csz.mdm.dto.MdmCourse;
import csz.mdm.service.IMdmCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
public class MdmCourseController extends BaseController {
    Logger logger = LoggerFactory.getLogger(MdmCourseController.class);
    @Autowired
    private IMdmCourseService service;
    @Autowired
    IProfileService iProfileService;

    /**
     * 查找学生所参与的该老师的课程
     */
    @RequestMapping(value = "/xx/mdm/course/queryStudentCourse")
    @ResponseBody
    public ResponseData queryStudentCourse(MdmCourse dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.queryStudentCourse(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/course/query")
    @ResponseBody
    public ResponseData query(MdmCourse dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        //数据屏蔽
        logger.info("IS_ADMIN:" + iProfileService.getProfileValue(requestContext, "IS_ADMIN"));
        if (!("ADMIN").equals(iProfileService.getProfileValue(requestContext, "IS_ADMIN"))) {
            dto.setUserId(requestContext.getUserName());
        }
        return new ResponseData(service.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/course/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<MdmCourse> dto, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        for (MdmCourse mdmCourse : dto) {
            if(mdmCourse.get__status().equals("add")){
                mdmCourse.setUserId(requestCtx.getUserName());
            }
        }
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }

        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/xx/mdm/course/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<MdmCourse> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }
}