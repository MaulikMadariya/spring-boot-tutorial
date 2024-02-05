package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@Component
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private StudentRepo studentRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Student student = studentRepo.findByUsername(username);
//		System.out.println(student);
		if (student == null) {
			throw new UsernameNotFoundException("User is Not Exist");
		}
		return new CustomUser(student);
	}

}
