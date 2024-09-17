package com.rays.autowire.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByConstructor {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-constructor.xml");
		
		UserService uservService = (UserService) context.getBean("userService");
	uservService.testAdd();
	
	}
}
