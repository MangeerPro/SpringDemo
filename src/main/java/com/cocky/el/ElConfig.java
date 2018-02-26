package com.cocky.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;


@Configuration
@ComponentScan("com.cocky.el")
@PropertySource(value = "classpath:test.properties") /*定义配置文件路径*/
public class ElConfig {
    //1、注入普通字符串
    @Value("I Love You!")
    private String normal;

    //2、注入系统属性
    @Value("#{systemProperties['os.name']}")
    private String osName;

    //3、注入表达式结果
    @Value("#{ T(java.lang.Math).random() * 100.0}")
    private double randomNumber;

    //4、注入其他Bean属性
    @Value("#{demoService.another}")
    private String fromAnother;

    //5、注入文件资源
    @Value(value = "classpath:test.txt")
    private Resource testFile;
    //6、注入网址资源
    @Value("http://www.baidu.com")
    private Resource testUrl;
    //7、注入配置文件
    @Value("${book.name}")
    private String bookName;
    //7、注入配置文件
    @Autowired
    private Environment environment;

    //8、使用Value注入，需要配置PropertySourcesPlaceholderConfigurer的Bean。
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
