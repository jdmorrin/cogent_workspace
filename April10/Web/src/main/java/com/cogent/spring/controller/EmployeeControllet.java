package com.cogent.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeControllet {
	
	@GetMapping("/employee")
	public String display() {
		return "David makes $1000";
	}
}
