package com.cuishizhou.onlineLearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author shizhou.cui
 * @Date 2019/1/11
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.cuishizhou.onlineLearning.mdm.dao")
public class OnlineLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineLearningApplication.class, args);
    }

}

