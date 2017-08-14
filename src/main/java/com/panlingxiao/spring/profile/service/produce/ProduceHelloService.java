package com.panlingxiao.spring.profile.service.produce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.panlingxiao.spring.profile.service.HelloService;

/**
 * 模拟在生产环境下需要使用的类
 */
@Component
public class ProduceHelloService implements HelloService {

    //这个值读取生产环境下的配置注入
    @Value("#{config.name}")
    private String name;

    public String sayHello() {
    	return "this is "+name;
        //return String.format("hello,I'm %s,this is a produce environment!",name);
    }
}


