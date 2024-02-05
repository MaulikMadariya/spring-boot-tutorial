package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.model.school;
import com.example.demo.repository.schoolRepo;

@Service
public class schoolInfoImpl implements schoolInfo{

	@Autowired
	schoolRepo repo;
	
	@Override
	public void save(school school) {
		repo.save(school);
		
	}

	@Override
	public List<school> show() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(Integer Id) {
		// TODO Auto-generated method stub
		repo.deleteById(Id);
	}
	
	@Override
	public school update(school school) {
		
		school s = repo.findById(school.getId()).get();
		s.setStd(school.getStd());
		s.setName(school.getName());
		s.setStudent(school.getStudent());
		s.setType(school.getType());
		repo.save(school);
		return s;
	}

}
