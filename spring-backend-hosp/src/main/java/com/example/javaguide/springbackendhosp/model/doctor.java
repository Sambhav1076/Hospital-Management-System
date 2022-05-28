package com.example.javaguide.springbackendhosp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name = "Doctor")
public class doctor {
			
	
	@Id
	private long id;
	private String name;
	private int age;
	private String Specialised;
	private String gender;
	
//	@OneToOne
//	@JoinColumn(name = "SPEC_ID")
//	private Specialization specialization;


	public String getSpecialised() {
		return Specialised;
	}


	public void setSpecialised(String specialised) {
		Specialised = specialised;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	


	public doctor(String name, int age, String gender, String Specialised) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.Specialised=Specialised;
	}
	
	
	public doctor()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
}
