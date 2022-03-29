package com.example.emailsendingapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmailSendController {
	
	@Autowired
	private EmailService emailservice;

	@RequestMapping("/index")
	public String mailpage()
	{
		return "index";
	}
	
	@RequestMapping("/register")
	public String sendEmailAfterReg(@RequestParam String email,@RequestParam String subject,@RequestParam String message)
	{
		SimpleMailMessage mailmessage=new SimpleMailMessage();
		
		mailmessage.setTo(email);
		mailmessage.setSubject(subject);
		mailmessage.setFrom("itsonlyforme99@gmail.com");
		mailmessage.setText(message);
		emailservice.sendMail(mailmessage);
		
		return "success";
	}

	
	
	
	
}
