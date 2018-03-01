package com.cocky.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
 * SpringJunit4ClassRunner在Junit环境下提供
 * Spring TestContext Framework功能
 */
@RunWith(SpringJUnit4ClassRunner.class)
/*
 * @ContextConfiguration用来加载配置ApplicationContext，
 * classes属性用来配置加载类
 */
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("prod") //用来声明活动的profile
public class DemoBeanIntegrationTests {

    //注入Bean
    @Autowired
    public TestBean testBean;

    @Test
    public void prodBeanShouldInject() {
        String expected = "from production  profile";
        String actual = testBean.getContent();
        //用Junit的断言判断结果是否一致
        Assert.assertEquals(expected, actual);
    }
}
