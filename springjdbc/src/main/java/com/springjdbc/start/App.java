package com.springjdbc.start;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("*********** Program Started ***********");
		// making an object of springjdbc i.e JdbcTemplate

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbc/start/config.xml");

		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		String query = "insert into student(id, name, city) values (?,?,?)";

		// firing the query
		int result = template.update(query, 19102042, "Nidhi Singh", "Bhiwandi");

		System.out.println("Number of record inserted.." + result);
	}
}
