package com.cocky.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsnycTaskSerivce serivce = context.getBean(AsnycTaskSerivce.class);
        for (int i = 0; i < 10; i++) {
            serivce.executeAsnycTask(i);
            serivce.executeAsnycTaskPlus(i);
        }
        context.close();
    }
}
