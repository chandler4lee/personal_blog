package com.money.test.login.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.money.login.service.LoginService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class LoginServiceTest {

	@Autowired
	LoginService loginService;
	
	@Test
	public void isExistUser(){
		int i = loginService.isExistUser("1", "2");
		System.out.println(i);
	}
	
}
