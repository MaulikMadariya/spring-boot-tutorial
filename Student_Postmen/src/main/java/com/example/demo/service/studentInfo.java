package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;
import com.example.demo.model.teacher;

public interface studentInfo {

		void save(Student student);
		
		List<Student> show();
		
		void delete(Integer Id);
		
		Student update(Student student);
		
		
		
}
