package com.cogent.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cogent.spring.entity.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long>{
	
}
