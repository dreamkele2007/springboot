package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GM on 2017/9/11.
 */
@RestController
public class DemoSpringBootController {
    /**
     * RequestMapping 处理get/post方式请求
     * GetMapping 处理get方式请求
     * PostMapping 处理post方式请求
     * @return
     */
    @RequestMapping("/")
//    @GetMapping("/")
//    @PostMapping("/")
    public String helloWorld(){
        System.out.println("热加载实现");
        return "hi";
    }
    @RequestMapping("/e")
    public String testException(){
        int i = 100/0;
        return null;
    }

}
