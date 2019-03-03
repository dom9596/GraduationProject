package csz.mdm.controllers;

import csz.mdm.dto.MdmClass;
import csz.mdm.dto.MdmUser;
import csz.mdm.mapper.MdmUserMapper;
import csz.mdm.service.IMdmUserService;
import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import csz.mdm.dto.MdmClassStudent;
import csz.mdm.service.IMdmClassStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindingResult;

import java.util.List;

@Controller
public class MdmClassStudentController extends BaseController {

    @Autowired
    private IMdmClassStudentService service;
    @Autowired
    private MdmUserMapper mdmUserMapper;

    @RequestMapping(value = "/xx/mdm/class/student/insertClassStudent")
    @ResponseBody
    public ResponseData insertClassStudent( Long classId,  String userCode, HttpServletRequest request) {
        IRequest requestCtx = createRequestContext(request);
        System.out.println("classId"+classId+"userCode"+userCode);
        MdmUser user = new MdmUser();
        user.setUserCode(userCode);
        MdmUser mdmUser = mdmUserMapper.selectOne(user);
        MdmClassStudent mdmClassStudent = new MdmClassStudent();
        mdmClassStudent.setClassId(classId);
        mdmClassStudent.setUserId(mdmUser.getUserId());
        service.insertSelective(requestCtx, mdmClassStudent);
        return new ResponseData();
    }

    @RequestMapping(value = "/xx/mdm/class/student/queryClassStudent")
    @ResponseBody
    public ResponseData queryClassStudent(MdmClassStudent dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                                          @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.queryClassStudent(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/class/student/query")
    @ResponseBody
    public ResponseData query(MdmClassStudent dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
                              @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext, dto, page, pageSize));
    }

    @RequestMapping(value = "/xx/mdm/class/student/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<MdmClassStudent> dto, BindingResult result, HttpServletRequest request) {
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
            ResponseData responseData = new ResponseData(false);
            responseData.setMessage(getErrorMessage(result, request));
            return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/xx/mdm/class/student/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request, @RequestBody List<MdmClassStudent> dto) {
        service.batchDelete(dto);
        return new ResponseData();
    }
}