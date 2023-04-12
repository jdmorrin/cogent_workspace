package com.cogent.spring;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.cogent.spring.entity.User;
//import com.cogent.spring.repository.UserRepo;

@SpringBootApplication
public class April10Quiestion1Application {
//	@Autowired
//	UserRepo userRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(April10Quiestion1Application.class, args);
	}

//	@PostConstruct
//	public void initUsers() {
//		List<User> users = new ArrayList<>();
//		users.add(new User(101, "David", "password", "david@gmail.com"));
//		users.add(new User(102, "Juan", "password", "david@gmail.com"));
//		users.add(new User(103, "Sara", "password", "david@gmail.com"));
//		userRepo.saveAll(users);
//	}
}
