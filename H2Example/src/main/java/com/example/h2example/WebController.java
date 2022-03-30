package com.example.h2example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
		
	@RequestMapping("/login")
	public String loginpage()
	{
		return "login";
	}
	
	@RequestMapping("/register")
	public String registerpage()
	{
		return "register";
	}
	
}
