package com.cogent.infotech.april11.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_tbl")
public class User {
	@Id
	private int id;
	private String username;
	private String password;
	private String email;
	

	
	
}


