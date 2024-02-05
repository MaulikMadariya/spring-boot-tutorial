package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentImpl implements StudentService{

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public void saveStudent(Student student) {
		studentRepo.save(student);
		System.err.println("Data Saved...");
	}

	@Override
	public List<Student> getStudent() {
		return studentRepo.findAll();
	
	}
	 
}
