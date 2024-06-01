package com.tka.DatabaseDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String mobileno;
	
	@Column(unique = true)
	String emailid;
	
	public Person() {
		
	}

	public Person(String name, String mobileno, String emailid) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.emailid = emailid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", emailid=" + emailid + "]";
	}
	
	
	
	
	

}
