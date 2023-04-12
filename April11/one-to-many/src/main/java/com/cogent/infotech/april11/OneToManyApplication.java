package com.cogent.infotech.april11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.infotech.april11.entity.Course;
import com.cogent.infotech.april11.entity.Student;
import com.cogent.infotech.april11.repos.StudentRepo;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner{

	@Autowired
	StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student post = new Student("Yahya");
		Course c1 = new Course("Chemestry", 110.11);
		Course c2 = new Course("Literature", 111.11);
		Course c3 = new Course("Quantum Theology", 999.99);
		
		post.getCourses().add(c1);
		post.getCourses().add(c2);
		post.getCourses().add(c3);
		
		repo.save(post);
		System.out.println("Student added");
	}

}
