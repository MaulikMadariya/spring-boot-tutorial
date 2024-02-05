package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	void saveStudent(Student student);
	
	List<Student> getStudent();
	
	
}
