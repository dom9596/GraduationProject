package com.cuishizhou.onlineLearning.login.controller;

import com.cuishizhou.onlineLearning.login.service.IRegisterService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/testRegister")
    public void testRegister() {
        System.out.print("注册成功。//" + iRegisterService.registerUser() + "lvlalal");
    }

    /**
     * 用户注册账号
     */
    @RequestMapping("/in")
    public String RegisterIn() {

        System.out.print("我要注册。。。");
//        return "已经收到你的注册请求啦...." + "code:" + code + "password:" + password + "role:" + role;
        return "已经收到你的注册请求啦....";
    }

    /**
     * 用户注销账号
     */
    @RequestMapping("/out")
    public void RegisterOut() {
        System.out.print("你已经注销");
    }

}
