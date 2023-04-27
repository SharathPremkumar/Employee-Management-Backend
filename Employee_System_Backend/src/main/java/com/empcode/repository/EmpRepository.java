package com.empcode.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empcode.model.Emp;

public interface EmpRepository extends JpaRepository<Emp, Integer>{
	
	public List<Emp> findByDesignation(String designation);
	
	public List<Emp> findBySalary(String salary);
	
	public List<Emp> findByAddress(String address);

}
