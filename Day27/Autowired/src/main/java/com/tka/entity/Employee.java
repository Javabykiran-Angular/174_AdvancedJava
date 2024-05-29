package com.tka.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	@Value("${myid}")
	int id;
	
	
	@Value("${myname}")
	String name;
	
	@Autowired
	Country country;
	
	public Employee() {
		
	}
	
	
//	@Autowired
//	public Employee(@Value("Sumit") String name) {
//		super();
//		this.name = name;
//	}


	public Employee(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
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

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
	
	
	
	
}
