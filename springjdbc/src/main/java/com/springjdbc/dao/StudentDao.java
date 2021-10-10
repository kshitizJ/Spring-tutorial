package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.dao.entities.Student;

public interface StudentDao {
	public int insert(Student Student);

	public int change(Student student);

	public int delete(int studentId);

	public Student getStudent(int studentId);

	public List<Student> getAllStudents();
}
