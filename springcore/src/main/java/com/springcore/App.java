package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// we first have to create an object of ClassPathXmlApplicationContext class and
		// then pass our configuration file "config.xml"
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// then we pass the beans name to getBean("student1") method to get the object
		// of our class. Now since context.getBean("student1") return an object of
		// Student we will store it in Student's object
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}
}
