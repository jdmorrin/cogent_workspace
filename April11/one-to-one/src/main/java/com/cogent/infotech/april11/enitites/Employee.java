package com.cogent.infotech.april11.enitites;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="up_id")	// "up_id" will correspond to the passport's PRIMARY KEY
	private Passport passport;
	
	public Employee() {
		
	}

	public Employee(long id, String name, String email, Passport passport) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.passport = passport;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
}
