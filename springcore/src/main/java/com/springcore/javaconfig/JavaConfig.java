package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// To make our Java class a configuration file we use @Configuration
// @ ComponentScan scan all the classes in the pakage where we have put @Component above the Class

// @ComponentScan(basePackages = "com.springcore.javaconfig")
@Configuration
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		Samosa samosa = new Samosa();
		return samosa;
	}

	// if we want to change the name of our bean then we will pass the 'name'
	// parameter inside the @Bean annotation. The name parameter will take an array
	// of names and we can use those name to get our object
	@Bean(name = { "student", "temp" })
	public Student getStudent() {
		// creating a new object of student
		Student student = new Student(getSamosa());
		return student;
	}
}
