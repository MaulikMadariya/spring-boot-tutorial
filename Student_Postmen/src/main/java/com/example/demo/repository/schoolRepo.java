package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.school;

@Repository
public interface schoolRepo extends JpaRepository<school, Integer> {

}
