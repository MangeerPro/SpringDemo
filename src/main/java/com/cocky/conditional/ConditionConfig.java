package com.cocky.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 条件注解
 */
@Configuration
@ComponentScan("com.cocky.conditional")
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService getWindowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(OsxCondition.class)
    public ListService getOsxListService() {
        return new OsxListService();
    }
}
