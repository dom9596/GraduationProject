package com.cuishizhou.onlineLearning.login.controller;

import com.alibaba.fastjson.JSON;
import com.cuishizhou.onlineLearning.login.service.IRegisterService;
import com.cuishizhou.onlineLearning.mdm.model.Result;
import com.cuishizhou.onlineLearning.mdm.model.po.SysUserPo;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 注册控制类
 *
 * @author 崔世宙
 * @mail 1101133246@qq.com
 * @date 2019-01-23 23:40:12
 * @since jdk 1.8
 */
@RestController
@RequestMapping("/register")
@Api(value = "登录控制类")
public class RegisterController {

    @Autowired
    private IRegisterService iRegisterService;

    /**
     * 用户注册账号
     */
    @RequestMapping(value = "/in")
    public String RegisterIn(@RequestBody(required = false) SysUserPo userInfo) {

        return "已经收到你的注册请求啦...."+   iRegisterService.RegisterIn(userInfo);
    }

    /**
     * 用户注销账号
     */
    @RequestMapping("/out")
    public void RegisterOut() {
        System.out.print("你已经注销");
    }

    @RequestMapping("/testRegister")
    public void testRegister() {
        System.out.print("注册成功。//" + iRegisterService.registerUser() + "lvlalal");
    }

}
