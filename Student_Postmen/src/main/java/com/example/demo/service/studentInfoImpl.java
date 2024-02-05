package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book2;
import com.example.demo.model.Student;
import com.example.demo.model.teacher;
import com.example.demo.repository.studentRepo;

@Service
public class studentInfoImpl implements studentInfo {

	@Autowired
	private studentRepo repo;
	
	@Override
	public void save(Student student) {

		repo.save(student);
		
	}

	@Override
	public List<Student> show() {
		return repo.findAll();
	}

	@Override
	public void delete(Integer Id) {
		repo.deleteById(Id);
		
	}

	@Override
	public Student update(Student student) {
		
		Student s = repo.findById(student.getId()).get();
		s.setMarks(student.getMarks());
		s.setName(student.getName());
		s.setRollNo(student.getRollNo());
		s.setSubject(student.getSubject());
		repo.save(student);
		return s;
	}

	
	


}
