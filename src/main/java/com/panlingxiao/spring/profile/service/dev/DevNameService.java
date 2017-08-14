package com.panlingxiao.spring.profile.service.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.panlingxiao.spring.profile.service.HelloService;
import com.panlingxiao.spring.profile.service.NameService;

/**
 * 模拟在开发环境下使用类
 */

public class DevNameService implements NameService{

	@Override
	public String sayName() {
		// TODO Auto-generated method stub
		return "this is this name";
	}

}

