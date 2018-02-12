package com.cocky.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);
        DemoMethodService demoMethodService =
                context.getBean(DemoMethodService.class);
        demoMethodService.add();
        DemoAnnotationService demoAnnotationService =
                context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        context.close();
    }
}
