package com.example.springbootwithmongodb.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.annotation.Generated;
import jakarta.validation.constraints.Email;


@Document(collection = "patients")
public class Patients {
	@Id
	private int id;
	@Email(message = "Please use Email format")
	private String email;
	private String name;
	private int age;
	private ClinicalDetails clinicalDetails;
	public Patients(int id, String email, String name, int age, ClinicalDetails clinicalDetails) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.age = age;
		this.clinicalDetails = clinicalDetails;
	}
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ClinicalDetails getClinicalDetails() {
		return clinicalDetails;
	}
	public void setClinicalDetails(ClinicalDetails clinicalDetails) {
		this.clinicalDetails = clinicalDetails;
	}

	
}
