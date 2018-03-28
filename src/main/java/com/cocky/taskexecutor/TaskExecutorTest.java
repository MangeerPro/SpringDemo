package com.cocky.taskexecutor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TaskExecutorConfig.class})
public class TaskExecutorTest {

    @Autowired
    AsnycTaskSerivce asnycTaskSerivce;

    @Test
    public void test() {
        for (int i = 0; i < 10; i++ ) {
            asnycTaskSerivce.executeAsnycTask(i);
            asnycTaskSerivce.executeAsnycTaskPlus(i + 1);
        }
    }
}
