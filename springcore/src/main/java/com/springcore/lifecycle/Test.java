package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// ApplicationContext does not have the registerShutdownHook method so we will
		// use AbstractApplicationMethod

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
//		Samosa samosa = (Samosa) context.getBean("s1");
//		System.out.println(samosa);

		// to destroy the object you have to create a preshutdown hook
		/*
		 * context.registerShutdownHook();
		 * 
		 * System.out.println("--------------------------------"); Pepsi pepsi = (Pepsi)
		 * context.getBean("p1"); System.out.println(pepsi);
		 */

		context.registerShutdownHook();

		// using anotations
		// anotations are used in Example.java file
		Example example = (Example) context.getBean("ex");
		System.out.println(example);

	}
}
