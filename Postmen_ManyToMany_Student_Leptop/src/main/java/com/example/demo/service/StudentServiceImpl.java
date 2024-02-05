package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public ResponseDto addStudent(Student student, ResponseDto dto) {
		if (student != null) {
			studentRepo.save(student);
			dto.setStatus(200);
			dto.setMessage("Sucess");
			dto.setData("Student Added.....");
		} else {
			dto.setStatus(500);
			dto.setMessage("Error");
			dto.setData("Student Not Added.....");
		}
		return dto;
	}

	@Override
	public List<Student> showStudent() {
		return studentRepo.findAll();
	}

}
