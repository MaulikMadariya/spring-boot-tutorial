package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book2;
import com.example.demo.model.Student;
import com.example.demo.model.teacher;
import com.example.demo.repository.teacherRepo;

@Service
public class teacherInfoImpl implements teacherInfo{

	@Autowired
	private teacherRepo repo;
	
	@Override
	public void save(teacher teacher) {
		repo.save(teacher);
		
	}

	@Override
	public List<teacher> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub
		repo.deleteById(Id);
	}
	
	@Override
	public teacher update(teacher teacher) {
		
		teacher s = repo.findById(teacher.getId()).get();
		s.setDept(teacher.getDept());
		s.setName(teacher.getName());
		s.setExp(teacher.getExp());
		s.setSchool(teacher.getSchool());
		repo.save(s);
		return s;
	}

	@Override
	public teacher onToOne(Integer teacherId, Integer bookId) {
		
		teacher s = repo.findById(teacherId).get();
		Book2 b = new Book2();
		b.setBookId(bookId);
		s.setBookId(b);
		repo.save(s);
		return s;
	}
	
}
