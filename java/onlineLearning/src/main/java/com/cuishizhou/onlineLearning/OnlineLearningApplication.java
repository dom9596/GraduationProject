package com.cuishizhou.onlineLearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @Author shizhou.cui
 * @Date 2019/1/11
 */
@SpringBootApplication
@ServletComponentScan
public class OnlineLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineLearningApplication.class, args);
    }

}

