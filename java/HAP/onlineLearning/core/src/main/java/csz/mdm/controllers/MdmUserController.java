package csz.mdm.controllers;

import com.hand.hap.account.exception.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import csz.mdm.dto.MdmUser;
import csz.mdm.service.IMdmUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;

import java.util.List;


@Controller
public class MdmUserController extends BaseController {
    Logger logger = LoggerFactory.getLogger(MdmUserController.class);
    @Autowired
    private IMdmUserService service;


    /**
     * 教师查询自己的学生
     *
     * @param dto
     * @param page
     * @param pageSize
     * @param request
     * @return
     */
    @RequestMapping(value = "/api/public/xx/mdm/user/queryTeacherAllStudent")
    @ResponseBody
    public ResponseData queryTeacherAllStudent(MdmUser dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                               @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.queryTeacherAllStudent(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/api/public/xx/mdm/user/updatamdmuser")
    @ResponseBody
    public ResponseData updataMdmUser(@RequestBody MdmUser dto, HttpServletRequest request) throws UserException {
        IRequest iRequest = this.createRequestContext(request);
        logger.info("-------------------------");
        logger.info(dto.toString());
        service.updataMdmUser(dto, iRequest);
        return new ResponseData();
    }


    @RequestMapping(value = "/api/public/xx/mdm/user/insertmdmuser")
    @ResponseBody
    public ResponseData insertMdmUser(@RequestBody MdmUser dto, HttpServletRequest request) throws UserException {
        IRequest iRequest = this.createRequestContext(request);
        logger.info("-------------------------");
        logger.info(dto.toString());
        service.insertMdmUser(dto, iRequest);
        return new ResponseData();
    }


    @RequestMapping(value = "/api/public/xx/mdm/user/query")
    @ResponseBody
    public ResponseData query(MdmUser dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/user/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<MdmUser> dto, BindingResult result, HttpServletRequest request) {
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/xx/mdm/user/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<MdmUser> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }
}