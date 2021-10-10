package com.springjdbc.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springjdbc.dao.entities.Student;

// import com.springjdbc.dao.entities.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// xml file implementation
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/dao/JdbcConfig.java");

		// annotation file implementation
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);

		// getting the object of studentImplemets class and storing it in the parent
		// class i.e StudentDao interface
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// storing the data in the Student object
//		Student student = new Student();
//		student.setId(19102014);
//		student.setName("Soumyojoti Dutta");
//		student.setCity("Kolkata");

		// passing the student object to studentDao method
//		int result = studentDao.insert(student);

		// For updating the values in the database
//		Student student = new Student();
//		student.setId(19102014);
//		student.setName("Vedang Gore");
//		student.setCity("Kasarwadavli");
//		int result = studentDao.change(student);

		// For deleting the value
//		int id = 19102014;
//		int result = studentDao.delete(id);

		// selecting a particular student with id
//		Student student = studentDao.getStudent(19102015);

		// selecting all the student
		List<Student> allStudents = studentDao.getAllStudents();

		for (Student student : allStudents) {

			System.out.println(
					"Id: " + student.getId() + "\nName: " + student.getName() + "\nCity: " + student.getCity());
			System.out.println();
		}

	}

}
