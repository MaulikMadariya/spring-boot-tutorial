package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Emp;

public interface empRepo extends JpaRepository<Emp, Integer> {
@Query("SELECT s FROM Emp as s ORDER BY s.id ASC")
List<Emp> findAll();

}
