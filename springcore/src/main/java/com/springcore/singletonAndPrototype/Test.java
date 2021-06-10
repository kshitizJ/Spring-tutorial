package com.springcore.singletonAndPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.singletonAndPrototype.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/singletonAndPrototype/singletonPrototypeconfig.xml");

		// if we have used only @Component then we will do the following
//		Student student = context.getBean("student", Student.class);
//		System.out.println(student);

		// if we used parameterized @Component("ob") then we have to change the name in
		// getBean method
		Student student = context.getBean("student", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.hashCode());

		Student student2 = context.getBean("student", Student.class);
		System.out.println(student2.hashCode());

		// here we get two different hashCode of same type of instance because we have
		// set scope as protype in our Student Class

		// if we remove the scope annotation in the Student class then bydefault the IOC
		// container will assume that we have to return singleton object i.e same object
		// is returned when we create multiple instances of Student class.

	}

}
