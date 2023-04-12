package com.cogent.infotech.april11;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.infotech.april11.entities.User;
import com.cogent.infotech.april11.repos.UserRepo;

@SpringBootApplication
public class SpringBootSecurityAppApplication {

	@Autowired
	UserRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAppApplication.class, args);
		
		
	}
	
	@PostConstruct
	public void initUsers() {
		List<User> users = new ArrayList<>();
		users.add(new User(101, "David", "password", "david@gmail.com"));
		users.add(new User(102, "Juan", "password", "david@gmail.com"));
		users.add(new User(103, "Sara", "password", "david@gmail.com"));
		repo.saveAll(users);
		
	}

}
