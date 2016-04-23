package com.money.login.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.money.entity.Blog_user;
import com.money.login.dao.LoginDAO;
import com.money.login.service.LoginService;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDAO logindao;
	
	public int isExistUser(String user_name, String password) {
		Blog_user param = new Blog_user();
		param.setUser_name(user_name);
		param.setPassword(password);
		Blog_user user = logindao.select(param);
		
		int result = 0;
		
		if(user!=null){
			result = 1;
		}
		
		return result;
	}

}
