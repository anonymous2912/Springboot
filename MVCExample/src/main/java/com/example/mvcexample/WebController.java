package com.example.mvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

	@RequestMapping("/index")
	public String indexpage()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String homepage()
	{
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginpage()
	{
		return "login";
	}
	
	@PostMapping("/success")
	public String success(User user)
	{
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		
		return "home";
	}
	
}
