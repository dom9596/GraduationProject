package com.cuishizhou.onlineLearning.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author cuishizhou
 * @date 2019/1/11 10:36
 * @Description 测试
 */
@RestController
@RequestMapping("/hello")
public class HelloWorld {

    /**
     * http://localhost:8081/hello
     */
    @RequestMapping
    public String hello() {
        return "Hello Spring Boot";
    }

    /**
     * http://localhost:8081/hello/info?name=cuishizhou
     */
    @RequestMapping("/info")
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    /**
     * http://localhost:8081/hello/list?name=cuishizhou
     */
    @RequestMapping("/list")
    public List<Map<String, String>> getList(@RequestParam String name) {
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map = new HashMap<>();
            map.put("name", "shizhou.cui" + i);
            list.add(map);
        }
        return list;
    }

}
