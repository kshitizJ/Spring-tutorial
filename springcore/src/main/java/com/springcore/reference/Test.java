package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/referenceconfig.xml");
		A a1 = (A) context.getBean("aref");
		System.out.println(a1);
	}
}
