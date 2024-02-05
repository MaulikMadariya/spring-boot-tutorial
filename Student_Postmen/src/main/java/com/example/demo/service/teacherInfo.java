package com.example.demo.service;

import java.util.List;

import com.example.demo.model.teacher;

public interface teacherInfo {
	
	void save(teacher teacher);

	List<teacher> show();

	void delete(Integer Id);
	
	teacher update(teacher teacher);
	teacher onToOne(Integer teacherId, Integer bookId);
}
