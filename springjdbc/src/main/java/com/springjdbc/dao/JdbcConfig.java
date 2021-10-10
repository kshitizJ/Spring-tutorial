package com.springjdbc.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

// autowiring @ComponentScan

@Configuration
@ComponentScan(basePackages = { "com.springjdbc.dao" })
public class JdbcConfig {

	// Configuration java class which replaces the xml files

	@Bean(name = { "dataSourse" })
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springJdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("Kshitiz123@");
		return dataSource;
	}

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate template() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDataSource());
		return template;
	}

//	@Bean(name = { "studentDao" })
//	public StudentImplements studentDao() {
//		StudentImplements studentImplements = new StudentImplements();
//		studentImplements.setTemplate(template());
//		return studentImplements;
//	}

}
