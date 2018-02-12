package com.cocky.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService =
                (UseFunctionService) context.getBean("service");
        String str = useFunctionService.sayHello("spring!");
        System.out.println(str);
        context.close();
    }
}
