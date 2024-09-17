package com.rays.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class MyBeanAnnotation {

	@PreDestroy
	public void init() {
		System.out.println("init method");
	}

		@PostConstruct
	public void destroy() {
		System.out.println("destroy method");
	}

}
