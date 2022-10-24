package com.studentrestapi.studentrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentrestapi.studentrestapi.entity.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
