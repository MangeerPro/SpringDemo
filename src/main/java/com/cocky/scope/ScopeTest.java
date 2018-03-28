package com.cocky.scope;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ScopeTest {

    @Autowired
    DemoPrototypeService demoPrototypeService;

    @Autowired
    DemoPrototypeService demoPrototypeService1;

    @Autowired
    DemoSingletonService demoSingletonService;

    @Autowired
    DemoSingletonService demoSingletonService1;

    @Test
    public void test() {
        System.out.println("Prototype 1:" + demoPrototypeService.hashCode());
        System.out.println("Prototype 2:" + demoPrototypeService1.hashCode());

        System.out.println("Singleton 1:" + demoSingletonService.hashCode());
        System.out.println("Singleton 2:" + demoSingletonService1.hashCode());
    }
}
