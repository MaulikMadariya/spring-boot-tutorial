package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		
		Student student = studentRepo.findByUsername(userName);
//		System.err.println(student);

		
		if(student != null)
		{
			return new User(student.getUsername(),student.getPassword(),new ArrayList<>());
		}else
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		
	}
}
