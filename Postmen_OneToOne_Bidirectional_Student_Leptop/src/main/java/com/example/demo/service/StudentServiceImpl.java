package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;
import com.example.demo.repository.LeptopRepo;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Autowired
	private LeptopRepo leptopRepo;
	
	@Override
	public ResponseDto addStudent(Student student, ResponseDto dto) {
		 studentRepo.save(student);
		 dto.setStatus(200);
		 dto.setMessage("sucess");
		 dto.setData("Student Added....");
		 return dto;
	}

	@Override
	public List<Student> showstudent() {
		System.err.println(leptopRepo.findLeptopleptopNameByStudentStudentNameContaining("Sahil"));
		
		return studentRepo.findAll();
		
	}

}
