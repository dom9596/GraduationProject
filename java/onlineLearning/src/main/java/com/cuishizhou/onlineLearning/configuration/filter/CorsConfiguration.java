package com.cuishizhou.onlineLearning.configuration.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author cuishizhou
 * @date 2019/1/12 15:42
 * @Description 允许跨域访问
 * https://www.jianshu.com/p/66e1316c7126
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(CorsConfiguration.class);

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET", "POST", "DELETE", "PUT")
                .maxAge(3600);
    }

}
