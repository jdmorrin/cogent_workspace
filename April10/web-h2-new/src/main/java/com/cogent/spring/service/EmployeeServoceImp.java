package com.cogent.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.spring.entity.Employee;
import com.cogent.spring.repository.EmployeeRepo;

@Service
public class EmployeeServoceImp implements EmployeeService{

	@Autowired
	private EmployeeRepo empRepo;
	
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee);
	}

	@Override
	public List<Employee> fetchEmployee() {
		// TODO Auto-generated method stub
		
		return (List<Employee>)empRepo.findAll();
	}

}
