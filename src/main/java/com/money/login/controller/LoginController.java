package com.money.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.money.login.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/loginMain")
	public ModelAndView loginMain(){
		ModelAndView mav = new ModelAndView("login_main");
		
		int i = loginService.isExistUser("","");
		
		return mav;
	}
	
	@RequestMapping("/userLogin")
	public ModelAndView userLogin(String username,String password){
		ModelAndView mav = new ModelAndView("login/main_face");
		
		/*System.out.println("username:"+username);
		System.out.println("password:"+password);*/
		
		return mav;
	}
	
}
