package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/standaloneconfig.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getFriends());
		System.out.println(person.getFriends().getClass().getName());
		System.out.println("---------------------------------------------------");
		System.out.println(person.getFeeStructureMap());
		System.out.println(person.getFeeStructureMap().getClass().getName());
	}

}
