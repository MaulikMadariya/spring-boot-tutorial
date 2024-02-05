package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Intern;

@Repository
public interface internRepo extends JpaRepository<Intern, Integer>{

}
