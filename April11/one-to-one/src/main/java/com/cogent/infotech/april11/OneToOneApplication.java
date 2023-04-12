package com.cogent.infotech.april11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;

import com.cogent.infotech.april11.enitites.Passport;
import com.cogent.infotech.april11.enitites.Employee;
import com.cogent.infotech.april11.repositories.EmployeeRepo;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepo empRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setName("David");
		emp.setEmail("david@outlook.com");
		
		Passport pass = new Passport();
		pass.setAddr("Miami");
		pass.setExpiration("12-12-25");
		
		emp.setPassport(pass);
		empRepo.save(emp);
		System.out.println("Person has been saved");
	}

}
