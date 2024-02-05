package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.dto.StudentRepo;
import com.example.demo.model.Student;

@Component
public class CustomStudentService implements UserDetailsService {

	@Autowired
	private StudentRepo repo;

	@Override
	public UserDetails loadUserByUsername(String emailId) throws UsernameNotFoundException {

		Student byEmail = repo.findByStudentEmail(emailId);

		if (byEmail == null)
			throw new UsernameNotFoundException("User Not Found...");

		return new CustomUser(byEmail);

	}

}
