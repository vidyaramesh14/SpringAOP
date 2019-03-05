package com.bridgelabz.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("annobean.xml");
		
		Test college=context.getBean("test",Test.class);
		college.A();
		college.B();
	}

}
