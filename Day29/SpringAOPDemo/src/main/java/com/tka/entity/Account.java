package com.tka.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {
	
	int id;
	double amt;
	
	
	public void deposit() {
		System.out.println("Amount is deposited...");
	}
	
	public void deposit1(double amt1) {
		System.out.println("Amount is deposited... "+amt1);
	}
	
	public void withdraw() {
		System.out.println("U r withdraw the Amount successfully....");
	}
	
	
	public Account() {
		
	}
	
	
	public Account(double amt) {
		super();
		this.amt = amt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", amt=" + amt + "]";
	}
	
	
	

}
