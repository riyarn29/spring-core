package com.rays.autowire.notype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByNoType{

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("autowire-by-no-type.xml");
		
		UserService uservService = (UserService) context.getBean("userService");
	uservService.testAdd();
	
	}
}
