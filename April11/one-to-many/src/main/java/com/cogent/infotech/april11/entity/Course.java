package com.cogent.infotech.april11.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String course_name;
	private Double course_fee;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(String course_name, Double course_fee) {
		super();
		this.course_name = course_name;
		this.course_fee = course_fee;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Double getCourse_fee() {
		return course_fee;
	}

	public void setCourse_fee(Double course_fee) {
		this.course_fee = course_fee;
	}


	
//	public Comment(long id, String text) {
//		super();
//		this.id = id;
//		this.text = text;
//	}


	
	
}
