package wht.ora2062.controllers;

import org.springframework.stereotype.Controller;
import com.hand.hap.system.controllers.BaseController;
import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.ResponseData;
import wht.ora2062.dto.Demo;
import wht.ora2062.service.IOra2062DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    @RequestMapping(value = "/ora/2062")
    public class Ora2062DemoController extends BaseController{

    @Autowired
    private IOra2062DemoService service;


    @RequestMapping(value = "/api/public/hap/demo/query")
    @ResponseBody
    public ResponseData query(Demo dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/hap/demo/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<Demo> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/hap/demo/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Demo> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }




    }