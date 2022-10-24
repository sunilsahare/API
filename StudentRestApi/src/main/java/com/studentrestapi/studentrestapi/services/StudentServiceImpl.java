package com.studentrestapi.studentrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentrestapi.studentrestapi.dao.StudentDao;
import com.studentrestapi.studentrestapi.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudent(long studentId) {
		return studentDao.getOne(studentId);
	}

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public String deleteStudent(long studentId) {
		Student student = studentDao.getOne(studentId);
		studentDao.delete(student);
		return "Student deleted Successfully";
	}

}
