package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;

public interface StudentService {
	
	ResponseDto addStudent(Student student , ResponseDto dto);
	
	List<Student> showstudent();
}	
