package com.cocky.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 消息发布类
 */
@Component
public class DemoPublisher {
    //注入ApplicationContext用来发布事件
    @Autowired
    ApplicationContext context;

    public void publish(String msg) {
        //使用ApplicationContext的publishEvent来发布事件
        context.publishEvent(new DemoEvent(this, msg));
    }
}
