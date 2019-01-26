package com.cuishizhou.onlineLearning.configuration.interceptor;

import com.cuishizhou.onlineLearning.interceptor.AuthInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author cuishizhou
 * @date 2019/1/26 10:24
 * @Description 拦截器注册
 */
@Configuration
public class InterceptorConfiguration extends WebMvcConfigurationSupport {
//    @Autowired
//    private AuthInterceptor authInterceptor;
    /**
     * 添加拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
        //registry.addInterceptor(new MyInterceptor_copy()).addPathPatterns("/*");//有多个拦截器继续add进去
        super.addInterceptors(registry);
    }
}
