package com.cocky.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DiConfig.class})
@ActiveProfiles("pord")
public class IOCTest {

    @Autowired
    FunctionService functionService;

    @Test
    public void test() {
        System.out.println(functionService.sayHello("Chen"));
    }

}
