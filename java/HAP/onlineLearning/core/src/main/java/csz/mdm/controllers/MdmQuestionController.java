package csz.mdm.controllers;

import com.hand.hap.system.service.IProfileService;
import csz.mdm.dto.MdmCourse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import csz.mdm.dto.MdmQuestion;
import csz.mdm.service.IMdmQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
public class MdmQuestionController extends BaseController {
    Logger logger = LoggerFactory.getLogger(MdmQuestionController.class);
    @Autowired
    private IMdmQuestionService service;
    @Autowired
    IProfileService iProfileService;

    @RequestMapping(value = "/xx/mdm/question/questStudentQuestion")
    @ResponseBody
    public ResponseData questStudentQuestion(MdmQuestion dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.questStudentQuestion(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/question/query")
    @ResponseBody
    public ResponseData query(MdmQuestion dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        //数据屏蔽
        logger.info("IS_ADMIN:" + iProfileService.getProfileValue(requestContext, "IS_ADMIN"));
        if (!("ADMIN").equals(iProfileService.getProfileValue(requestContext, "IS_ADMIN"))) {
            dto.setUserId(requestContext.getUserName());
        }
        return new ResponseData(service.questQuestion(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/question/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<MdmQuestion> dto, BindingResult result, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        for (MdmQuestion mdmQuestion : dto) {
            if (mdmQuestion.get__status().equals("add")) {
                mdmQuestion.setUserId(requestCtx.getUserName());
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

    @RequestMapping(value = "/xx/mdm/question/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<MdmQuestion> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }
}