package com.cocky.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 监听类
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{
    /**
     * 处理消息
     * @param event
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {
       String msg = event.getMsg();
        System.out.println("我demolistener接受到Pubblisher发布的消息：" + msg);
    }
}
