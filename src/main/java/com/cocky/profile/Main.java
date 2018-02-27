package com.cocky.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        //1、设置活动的profile
        context.getEnvironment().setActiveProfiles("prod");
        //2、注册Bean配置类
        context.register(ProfileConfig.class);
        //3、刷新容器
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());
        context.close();
    }
}
