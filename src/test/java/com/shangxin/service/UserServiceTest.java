package com.shangxin.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shangxin.bean.User;
import com.shangxin.serivce.userSerivce;

public class UserServiceTest {

	private ApplicationContext context;

	@Before
	public void init() {
		this.context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void getUserTest() {
		userSerivce bean = this.context.getBean(userSerivce.class);
		User user = bean.selectById("1");
		System.out.println(user.getUserLe());
	}
}
