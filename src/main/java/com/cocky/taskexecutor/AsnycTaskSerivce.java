package com.cocky.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步线程执行服务类
 */
@Service
public class AsnycTaskSerivce {

    @Async
    public void executeAsnycTask(Integer integer) {
        System.out.println("执行异步任务：" + integer);
    }
    @Async
    public void executeAsnycTaskPlus(Integer integer) {
        System.out.println("执行异步任务 + 1：" + (integer+1));
    }
}
