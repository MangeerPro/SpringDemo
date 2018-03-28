package com.cocky.prepost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PrePostConfig.class})
public class PrepostTest {

    @Autowired
    BeanWayService beanWayService;
    @Autowired
    JSR250WayService jsr250WayService;

    @Test
    public void test() {
        
    }
}
