package com.huahua;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @SpringBootApplication申明让springBoot自动给程序进行必要的配置，等价于以默认属性使用
 * @EnableAutoConfiguration:开启自动配置.根据maven导入的工程自动加载相关依赖的包
 * @ComponentScan:spring:IOC自动扫描,默认扫描入口类为根目录下的文件
 * @ServletComponentScan:Servlet可以直接通过@WebServlet注解自动注册
 *                       Filter可以直接通过@WebFilter注解自动注册
 *                       Listener可以直接通过@WebListener 注解自动注册
 *
 */
@ServletComponentScan
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
