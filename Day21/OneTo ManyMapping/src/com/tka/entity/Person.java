package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	List<Address> listaddress;
	
	public Person() {
		
	}
	
	public Person(String name) {
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
	
	
	
	public List<Address> getListaddress() {
		return listaddress;
	}

	public void setListaddress(List<Address> listaddress) {
		this.listaddress = listaddress;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", listaddress=" + listaddress + "]";
	}

//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + "]";
//	}
//	
	
	
	
	
	
	

}
