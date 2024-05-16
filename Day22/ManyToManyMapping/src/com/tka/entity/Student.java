package com.tka.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String name;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "student_laptop",joinColumns = 
	{
	@JoinColumn(name="stud_id", referencedColumnName = "id")
			
	}, inverseJoinColumns = {
	@JoinColumn(name="laptop_id",referencedColumnName = "id")
	}
	)
	List<Laptop> laplist;
	
	
	
//	@ManyToMany(fetch = FetchType.EAGER)
//	@JoinTable(name = "stud_laptop_id",joinColumns = {
//			@JoinColumn(name="stud_id",referencedColumnName = "id")
//	},inverseJoinColumns = {			
//			@JoinColumn(name="laptop_id",referencedColumnName = "id")
//			
//	})
	
	public Student() {
		
	}

	public Student(String name) {
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
	
	

	public List<Laptop> getLaplist() {
		return laplist;
	}

	public void setLaplist(List<Laptop> laplist) {
		this.laplist = laplist;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
