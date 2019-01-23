package com.cuishizhou.onlineLearning.login.controller;

import com.cuishizhou.onlineLearning.login.service.ILoginService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/testLogin")
    public void testLogin() {
        System.out.print("登录成功。//" );
    }

}
