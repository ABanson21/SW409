package com.sw409.Hospital.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Patients")
public class Patient {
	String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	int age;
	String disease;
	String doctor;

	public Patient(Integer id, String name, int age, String disease, String doctor) {
		
		this.id = id;
		this.name=name;
		this.age = age;
		this.disease = disease;
		this.doctor  = doctor;
		
	}
	
	public Patient() 
	{
		
	}

	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age= age;
	}
	
	public String getDisease() {
		return disease;
	}
	
	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	public String getDoctor() {
		return doctor;
	}
	
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	
	public String printString() {
		return "Id: "+ id + "Name: " + name + "Age: " + age + "Disease: " + disease + "Doctor: " + doctor;
}	
	
	
}