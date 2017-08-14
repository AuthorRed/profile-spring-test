package com.panlingxiao.spring.profile.service.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.panlingxiao.spring.profile.service.HelloService;

/**
 * 模拟在开发环境下使用类
 */
@Component
public class DevHelloService implements HelloService{

    //这个值是读取开发环境下的配置文件注入
    @Value("#{config.name}")
    private String name;

    public String sayHello() {
    	return "this is "+name;
//        return String.format("hello,I'm %s,this is a development environment!", name);
    }

}

