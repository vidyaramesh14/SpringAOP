package com.bridgelabz.aop;
//import org.jbehave.core.annotations;

//@Aspect
public class TestOperation {
	//@Before("execution(public String getName())")
	public void logging(){
		System.out.println("Aspect method run");
	}
}
