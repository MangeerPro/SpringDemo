package com.cocky.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.cocky.taskscheduler")
@EnableScheduling   //支持定时任务
public class TaskSchedulerConfig {
}
