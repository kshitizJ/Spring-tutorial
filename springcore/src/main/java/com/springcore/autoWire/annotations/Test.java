package com.springcore.autoWire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/autoWire/annotations/autowireconfig.xml");

		// with typecast
		// Emp emp = (Emp) context.getBean("employee");

		// if we dont want to type cast then we can do the following
		Emp emp = context.getBean("employee", Emp.class);
		System.out.println(emp);
	}
}
