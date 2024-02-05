 package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	void save(Student student);
	
	List<Student> show();
	
	Student updateStudentWithBookID(Integer studentId , Integer bookId);
}
