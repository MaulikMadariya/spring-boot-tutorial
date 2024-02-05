package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo repo;
	
	@Override
	public void save(Student student) {
		
		repo.save(student);
	}

	@Override
	public Student updateStudentWithBookID(Integer studentId, Integer bookId) {
		
		Student s = repo.findById(studentId).get();
		Book b = new Book();
		b.setBookId(bookId);
		s.setBookId(b);
		repo.save(s);
		return s;
		
	}

	@Override
	public List<Student> show() {
		
		return repo.findAll();
	}

}
