package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.teacher;

@Repository
public interface teacherRepo extends JpaRepository<teacher, Integer> {

}
