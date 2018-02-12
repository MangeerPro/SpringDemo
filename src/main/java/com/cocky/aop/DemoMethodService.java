package com.cocky.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法触发AOP切入点通知
 */
@Service
public class DemoMethodService {
    public void add() {
        System.out.println("DemoMethodService");
    }
}
