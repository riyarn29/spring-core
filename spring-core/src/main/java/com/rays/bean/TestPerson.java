package com.rays.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestPerson {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Person.xml");

		Person person = (Person) context.getBean("person");

		System.out.println("Person's name: " + person.getName());
	}
}
