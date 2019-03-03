package csz.mdm.controllers;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.system.dto.ResponseData;
import com.hand.hap.system.service.IProfileService;
import csz.mdm.dto.MdmClass;
import csz.mdm.dto.MdmCourse;
import csz.mdm.service.IMdmClassService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MdmClassController extends BaseController {
    Logger logger = LoggerFactory.getLogger(MdmClassController.class);
    @Autowired
    private IMdmClassService service;
    @Autowired
    IProfileService iProfileService;

    @RequestMapping(value = "/xx/mdm/class/queryStudentCourseClass")
    @ResponseBody
    public ResponseData queryStudentCourseClass(MdmClass dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                                @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.queryStudentCourseClass(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/class/query")
    @ResponseBody
    public ResponseData query(MdmClass dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        //数据屏蔽
        logger.info("IS_ADMIN:" + iProfileService.getProfileValue(requestContext, "IS_ADMIN"));
        if (!("ADMIN").equals(iProfileService.getProfileValue(requestContext, "IS_ADMIN"))) {
            dto.setUserId(requestContext.getUserName());
        }
        return new ResponseData(service.queryClass(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/class/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<MdmClass> dto, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        for (MdmClass mdmClass : dto) {
            mdmClass.setUserId(requestCtx.getUserName());
        }
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/xx/mdm/class/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<MdmClass> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }
}