package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Intern;

@Repository
public interface InternRepo extends JpaRepository<Intern, Integer> {

	@Query(value="SELECT i.intern_name FROM intern as i WHERE i.intern_salary=?1",nativeQuery = true)
	public Object salaryIntern(long internSalary);
	
//	@Query(value="select m.manager_name from manager as m, intern as i where i.intern_name='Maulik'")
}
