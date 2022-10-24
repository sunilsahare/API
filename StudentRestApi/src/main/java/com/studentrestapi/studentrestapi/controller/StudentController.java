package com.studentrestapi.studentrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentrestapi.studentrestapi.entity.Student;
import com.studentrestapi.studentrestapi.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/")
	public String home() {
		return "Welcome to Student API";
	}
	
	//Get all sudent list
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getStudents(){
//		return studentService.getStudents();
		return new ResponseEntity<>(studentService.getStudents(), HttpStatus.OK);
	}
	
	//get single student by the id
	@GetMapping("/student/{studentId}")
	public ResponseEntity<Student> getStudent(@PathVariable String studentId) {
		return new ResponseEntity<>(studentService.getStudent(Long.parseLong(studentId)),HttpStatus.OK);
	}
	
	//add student in db
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {
		return new ResponseEntity<>(studentService.addStudent(student),HttpStatus.OK);
	}
	
	//update student in db
	@PutMapping("/student")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student) {
		return new ResponseEntity<>(studentService.updateStudent(student),HttpStatus.OK);
	}
	
	//delete student from db
	@DeleteMapping("/student/{studentId}")
	public ResponseEntity<String> deleteStudent(@PathVariable String studentId) {
		return new ResponseEntity<>(studentService.deleteStudent(Long.parseLong(studentId)),HttpStatus.OK);
	}
	
}
