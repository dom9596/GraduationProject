package com.cuishizhou.onlineLearning.login.controller;

import com.cuishizhou.onlineLearning.login.service.ILoginService;
import com.cuishizhou.onlineLearning.mdm.model.ResponseData;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import com.cuishizhou.onlineLearning.unit.jwt.JWTUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 登陆控制类
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-23 23:40:12
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/login")
@Api(value = "登录控制类")
public class LoginController {
    @Autowired
    private ILoginService iLoginService;

    @RequestMapping("/in")
    public ResponseData LoginIn(@RequestBody SysUserPo sysUserPo) {
        List<SysUserPo> list = new ArrayList<>();
        list = iLoginService.questUser(sysUserPo);
        ResponseData responseData = new ResponseData(list);
        if (list.size() > 0) {
            responseData.setToken(JWTUtils.createJWT(sysUserPo));
            responseData.setMessage("登录成功");
        } else {
            responseData.setMessage("登录失败");
        }
        return responseData;
    }

    @RequestMapping("/testLogin")
    public void testLogin() {
        System.out.print("登录成功。//");
    }

}
