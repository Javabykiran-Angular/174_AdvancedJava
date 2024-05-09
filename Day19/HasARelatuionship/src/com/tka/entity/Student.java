package com.tka.entity;

public class Student {

	int id;
	String name;
	String mobileno;
	
	Address add;
	
	
	public Student() {
		
	}
	
	public Student(String name, String mobileno,String area,String buildname,String city) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		add=new Address(area,buildname,city);
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobileno=" + mobileno + ", add=" + add + "]";
	}
	
	
	
	
	
}
