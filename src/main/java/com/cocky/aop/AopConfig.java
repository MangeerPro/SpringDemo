package com.cocky.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cocky.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
