package com.huahua.base.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author GYM
 * @date 2020/4/1
 * @Description: 定时任务
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
//    @Scheduled(cron = "0/2 * * * * ?") // 每2秒执行一次
//    public void scheduler() {
//        System.out.println("hello world Springboot");
//    }
}
