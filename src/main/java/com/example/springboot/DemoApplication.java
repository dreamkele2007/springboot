package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @SpringBootApplication申明让springBoot自动给程序进行必要的配置，等价于以默认属性使用
 * @Configuration:标明该类为springboot项目的配置类
 * @EnableAutoConfiguration:开启自动配置.根据maven导入的工程自动加载相关依赖的包
 * @ComponentScan:spring:IOC自动扫描,默认扫描入口类为根目录下的文件
 */
@ServletComponentScan
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}