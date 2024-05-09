package com.tka.entity;

public class Address {
	
	int id;
	String area;
	String build_name;
	String city;
	
	public Address() {
		
	}
	
	
	public Address(String area, String build_name, String city) {
		super();
		this.area = area;
		this.build_name = build_name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBuild_name() {
		return build_name;
	}
	public void setBuild_name(String build_name) {
		this.build_name = build_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", area=" + area + ", build_name=" + build_name + ", city=" + city + "]";
	}
	
	

}
