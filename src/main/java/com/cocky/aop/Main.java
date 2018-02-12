package com.cocky.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /* 通过注解类
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        */

        /*
         * 通过配置文件
         */
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        DemoMethodService demoMethodService =
                context.getBean(DemoMethodService.class);
        demoMethodService.add();
        DemoAnnotationService demoAnnotationService =
                context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
    }
}
