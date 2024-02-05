package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;



public interface UserService {
    User save(UserDto user);
    List<User> findAll();
    User findOne(String username);
}
