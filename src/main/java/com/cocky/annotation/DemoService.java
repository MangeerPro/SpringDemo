package com.cocky.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public void outputResult() {
        System.out.println("从组合配置注解获得Bean");
    }
}

