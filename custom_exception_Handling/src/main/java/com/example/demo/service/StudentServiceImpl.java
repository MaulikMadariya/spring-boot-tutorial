package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.StudentNotFoundById;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo repo;
	
	@Override
	public Student findAllStudent(Integer studentId ) {
		Student student = repo.findById(studentId).orElseThrow(()-> new StudentNotFoundById("Student not found....")) ;
		return student;
	} 

}
