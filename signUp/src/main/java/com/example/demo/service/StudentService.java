package com.example.demo.service;		

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;

public interface StudentService {

	public ResponseEntity<ResponseDto> addStudent(Student student);
}
