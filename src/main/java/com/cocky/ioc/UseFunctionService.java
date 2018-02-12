package com.cocky.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String str) {
        return functionService.sayHello(str);
    }
}
