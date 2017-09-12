package com.example.springboot.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by GM on 2017/9/12.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
//    @Scheduled(cron = "0/2 * * * * ?") // 每2秒执行一次
//    public void scheduler() {
//        System.out.println("hello world Springboot");
//    }
}
