package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDto;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo repo;
	
	@Override
	public void save(StudentDto dto1) {
//		List<Student> arr = new ArrayList<>();
		Student student =  new Student();
		student.setStudentName(dto1.getStudentName());
		student.setMarks(dto1.getMarks());
		student.setStudentRollNo(dto1.getStudentRollNo());
		student.setStudentId(dto1.getStudentId());
		repo.save(student);
	}

	@Override
	public List<StudentDto> find() {
		
		List<Student> arr = repo.findAll();
//		System.err.println(arr);
	
		List<StudentDto> dtos = new ArrayList<>();
		
		for(Student x : arr)
		{
			StudentDto dto = new StudentDto();
			dto.setStudentId(x.getStudentId());
			dto.setMarks(x.getMarks());
			dto.setStudentName(x.getStudentName());
			dto.setStudentRollNo(x.getStudentRollNo());
			dtos.add(dto);
		}
//		System.err.println(dtos);
		return dtos;
	}

	@Override
	public void delete(Long studentId) {
		repo.deleteById(studentId);
		
	}

	@Override
	public StudentDto edit(Long studentId) {
		Student s = repo.findById(studentId).get();
		StudentDto dto = new StudentDto();
		dto.setMarks(s.getMarks());
		dto.setStudentName(s.getStudentName());
		dto.setStudentId(s.getStudentId());
		dto.setStudentRollNo(s.getStudentRollNo());
		
		return dto;
	}

}
