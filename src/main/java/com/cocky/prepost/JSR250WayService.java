package com.cocky.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    //在构造完成之后执行
    @PostConstruct
    public void init() {
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    //在Bean销毁之前执行
    @PreDestroy
    public void destory() {
        System.out.println("JSR250-destory-method");
    }
}

