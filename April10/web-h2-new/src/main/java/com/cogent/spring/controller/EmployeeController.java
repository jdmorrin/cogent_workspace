package com.cogent.spring.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.spring.entity.Employee;
import com.cogent.spring.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/employees")
	public Employee saveEmp(@Validated @RequestBody Employee emp) {
		return service.saveEmployee(emp);
	}
	
	@GetMapping("/employees")
	public List<Employee> fetchEmpList(){
		return service.fetchEmployee();
	}
}
