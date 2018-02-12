package com.cocky.aop;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面,切入点，以及通知方式
 */
@Aspect // 切面声明注解
@Component //通过Component，加入context成为Bean
public class LogAspect {

    //注解切入点
    @Pointcut("@annotation(com.cocky.aop.Action)")
    public void annotationPointCut() {}

    //方法切入点
    @Pointcut("execution(* com.cocky.aop.DemoMethodService.*(..))")
    public void methodPointCut() {}

    //注解式触发通知，切入点后通知
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature =
                (MethodSignature)joinPoint.getSignature();
        //反射机制获取运行式方法
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        //调用自定义注解的name，获取name的赋值
        System.out.println("注解式拦截 " + action.name());
    }

    //使用方法触发通知，切入点后通知
    @Before("methodPointCut()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature =
                (MethodSignature)joinPoint.getSignature();
        //反射机制获取运行式方法
        Method method = signature.getMethod();
        System.out.println("方法式拦截器：" + method.getName());
    }

}
