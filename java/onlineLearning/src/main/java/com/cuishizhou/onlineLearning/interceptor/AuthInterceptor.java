package com.cuishizhou.onlineLearning.interceptor;

import com.cuishizhou.onlineLearning.unit.jwt.JWTResult;
import com.cuishizhou.onlineLearning.unit.jwt.JWTUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cuishizhou
 * @date 2019/1/26 10:22
 * @Description token认证拦截器
 */
//@Component
public class AuthInterceptor implements HandlerInterceptor {


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
        // TODO Auto-generated method stub
        System.out.println("postHandle....");
        //校验token
        String token = request.getHeader("Authorization");
        JWTResult jwtResult = JWTUtils.checkToken(token);
        System.out.println("拦截器中的Authorization:" + token + ":" + jwtResult.getMsg());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
            throws Exception {
        // TODO Auto-generated method stub
        //请求处理之后进行调用，但是在视图被渲染之前，即Controller方法调用之后
        System.out.println("postHandle....");
    }

    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
            throws Exception {
        // TODO Auto-generated method stub
        //在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行，主要是用于进行资源清理工作
        System.out.println("preHandle....");
    }

}
