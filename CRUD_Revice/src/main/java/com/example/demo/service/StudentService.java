package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StudentDto;

public interface StudentService {
	
	public List<StudentDto> find();
	
	public void save(StudentDto dto);
	
	public void delete(Long studentId);
	
	public StudentDto edit(Long studentId);
}
