package com.tka.DemoMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.DemoMVC.entity.User;
import com.tka.DemoMVC.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("login")
	public String checkUser(@ModelAttribute User user) {
		//System.out.println("Login Request");
		//System.out.println(user);
		
		String msg= service.checkUser(user);
		
		if(msg.equalsIgnoreCase("valid user")) {
			return "home";
		}else {
			return "login";
		}		
		
		
	}
	
}
