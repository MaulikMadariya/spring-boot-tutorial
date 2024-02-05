package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Intern;

@Repository
public interface InternRepo extends JpaRepository<Intern, Integer> {

}
