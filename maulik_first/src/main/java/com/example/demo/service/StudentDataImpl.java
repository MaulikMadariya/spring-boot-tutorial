package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public class StudentDataImpl implements StudentData {
	List<User> users = new ArrayList<>();
	@Override
	public void display() {
		users.clear();
		if(users.isEmpty())
		{
			User user = new User();

			user.setId(1);
			user.setName("MB");
			user.setStd(10);
			user.setMarks(70);
			
			User user1 = new User();

			user1.setId(2);
			user1.setName("Maulik");
			user1.setStd(12);
			user1.setMarks(90);
			
			User user2 = new User();

			user2.setId(3);
			user2.setName("Ravi");
			user2.setStd(5);
			user2.setMarks(50);

			users.add(user);
			users.add(user1);
			users.add(user2);
		}

		System.out.println(users);

	}

	@Override
	public void First() {
		
		users.clear();
		if(users.isEmpty())
		{
			User user = new User();

			user.setId(1);
			user.setName("MB");
			user.setStd(10);
			user.setMarks(70);

			users.add(user);
		}
		
		System.out.println(users.get(0));
//		System.out.println(users.);
	}

}
