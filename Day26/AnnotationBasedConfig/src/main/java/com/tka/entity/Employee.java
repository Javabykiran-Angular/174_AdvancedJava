package com.tka.entity;

import org.springframework.stereotype.Component;

@Component(value = "e_2")
public class Employee {
	
	int id;
	String name;
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		super();
		this.name = name;
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

//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
//		

}
