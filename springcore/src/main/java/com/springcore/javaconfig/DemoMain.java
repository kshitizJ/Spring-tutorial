package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		// getStudent is the method in JavaConfig Class which returns the Student
		// object. If you have declared the 'name' in @Bean annotation in the JavaConfig
		// Class then you can also use those names to call the bean and get the object
		
		// Student student = context.getBean("getStudent", Student.class);
		Student student = context.getBean("student", Student.class);
		
		
		System.out.println(student.hashCode());
		student.stud();
		// context.close();
	}
}
