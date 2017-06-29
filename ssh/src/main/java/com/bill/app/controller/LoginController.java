package com.bill.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bill.entity.User;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping("/login.do")
	public String Login(User user){
		System.out.println("username:"+user.getUsername());
		System.out.println("password:"+user.getPassword());
		
		return "hello";
	}
}
