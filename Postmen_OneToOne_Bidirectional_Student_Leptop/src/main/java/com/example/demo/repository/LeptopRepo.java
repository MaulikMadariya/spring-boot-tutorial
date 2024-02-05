package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Leptop;

@Repository
public interface LeptopRepo extends JpaRepository<Leptop, Integer> {

//	@Query(value="select * from leptop",nativeQuery = true)
//	@Query(value="select l.leptop_name from leptop as l\r\n"
//			+ "INNER JOIN student as s\r\n"
//			+ "ON l.student_student_id = s.student_id\r\n"
//			+ "WHERE s.student_name = ?1",nativeQuery = true)
//	public List<Leptop> findLeptopleptopNameByStudentStudentNameContaining(String sName);
	
	public List<Leptop> findLeptopleptopNameByStudentStudentNameContaining(String sName);
}
