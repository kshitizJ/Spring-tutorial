package com.springcore.stereotypeComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.standalone.collections.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotypeComponentAnnotation/stereoconfig.xml");

		// if we have used only @Component then we will do the following
//		Student student = context.getBean("student", Student.class);
//		System.out.println(student);

		// if we used parameterized @Component("ob") then we have to change the name in
		// getBean method
		Student student = context.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
	}

}
