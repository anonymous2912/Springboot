package com.example.myfirstapp;

import org.springframework.stereotype.Component;

@Component

public class Student {
	
	public Student()
	{
		System.out.println("Object Created");
	}
	
	public void display()
	{
		System.out.println("Display Method");
	}
		
}
