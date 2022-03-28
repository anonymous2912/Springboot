package com.example.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyFirstAppApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(MyFirstAppApplication.class, args);
		
		System.out.println("Hello World");
		
		Student s = context.getBean(Student.class);
		s.display();
		
		Student s1 = context.getBean(Student.class);
		s1.display();
		
	}
}
