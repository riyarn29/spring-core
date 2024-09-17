package com.rays.autowire.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByName {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-name.xml");
		
		UserService uservService = (UserService) context.getBean("userService");
	uservService.testAdd();
	
	}
}
