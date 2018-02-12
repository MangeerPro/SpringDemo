package com.cocky.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Prototype 模式
        DemoPrototypeService demoPrototypeService =
                context.getBean(DemoPrototypeService.class);
        System.out.println("1: " + demoPrototypeService.hashCode());
        demoPrototypeService = context.getBean(DemoPrototypeService.class);
        System.out.println("2: " + demoPrototypeService.hashCode());

        //Singleton 模式
        DemoSingletonService singletonService =
                context.getBean(DemoSingletonService.class);
        System.out.println("3: " + singletonService.hashCode());
        singletonService =
                context.getBean(DemoSingletonService.class);
        System.out.println("4: " + singletonService.hashCode());

    }
}
