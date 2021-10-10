package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.dao.entities.Student;

@Component("studentDao")
public class StudentImplements implements StudentDao {

	@Autowired
	private JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student(id, name, city) values (?,?,?)";
		int update = this.template.update(query, student.getId(), student.getName(), student.getCity());
		return update;
	}

	// update the data
	public int change(Student student) {
		// TODO Auto-generated method stub
		String query = "update student set name = ?, city = ? where id = ?";
		int update = this.template.update(query, student.getName(), student.getCity(), student.getId());
		return update;
	}

	// delete the data
	public int delete(int studentId) {
		// TODO Auto-generated method stub
		String query = "delete from student where id = ?";
		int update = this.template.update(query, studentId);
		return update;
	}

	// select a particular student by id
	public Student getStudent(int studentId) {
		// TODO Auto-generated method stub
		String sql = "select * from student where id = ?";

		// normal way
//		RowMapper<Student> rowMapper = new RowMapperImplement();
//		Student student = this.template.queryForObject(sql, rowMapper, studentId);

		// we can also use enormous way and pass a fucntion to a function
		Student student = this.template.queryForObject(sql, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));
				return student;
			}
		}, studentId);

		return student;
	}

	// selecting all the students
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		String query = "select * from student";
		List<Student> students = this.template.query(query, new RowMapperImplement());
		return students;
	}

}
