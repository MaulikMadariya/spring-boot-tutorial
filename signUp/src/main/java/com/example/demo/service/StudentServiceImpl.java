package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ResponseDto;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service	
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public ResponseEntity<ResponseDto> addStudent(Student student) {
		
		Student student_exist  = studentRepo.findByUsername(student.getUsername());
		ResponseDto dto = new ResponseDto();
		
		
		
		if(student_exist == null)
		{
			student.setPassword(new BCryptPasswordEncoder().encode(student.getPassword()));
			dto.setData(studentRepo.save(student));
			dto.setMessage("Student Register Successfully....");
			dto.setStatus(200);
			return new ResponseEntity<ResponseDto>(dto,HttpStatus.ACCEPTED);
		}
		dto.setMessage("Student Alreday Exist");
		dto.setData("Error");
		dto.setStatus(500);
		return new ResponseEntity<ResponseDto>(dto,HttpStatus.BAD_REQUEST);
		
				
	}	

}
