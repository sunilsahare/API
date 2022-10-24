package com.studentrestapi.studentrestapi.services;

import java.util.List;

import com.studentrestapi.studentrestapi.entity.Student;

public interface StudentService {
	//abstract method
	public List<Student> getStudents();
	public Student getStudent(long studentId);
	public Student addStudent(Student student);
	public Student updateStudent(Student student);
	public String deleteStudent(long studentId);
	
}
