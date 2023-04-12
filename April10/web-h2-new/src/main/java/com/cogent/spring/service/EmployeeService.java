package com.cogent.spring.service;

import java.util.List;

import com.cogent.spring.entity.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> fetchEmployee();
}
