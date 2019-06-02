/*
 *
 */
package com.fijo.boot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.concurrent.Executors;

/**
 * 用途：定时任务配置
 * 作者: zhangbo
 * 时间: 2018/4/17  23:28
 */
@Configuration
@EnableScheduling
public class ScheduledTaskConfiguration implements SchedulingConfigurer {
    @Override
    public void configureTasks( ScheduledTaskRegistrar taskRegistrar) {
        //设定一个长度10的定时任务线程池
        taskRegistrar.setScheduler( Executors.newScheduledThreadPool(10));
    }
}
