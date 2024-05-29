package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.entity.Country;
import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
		//Country c= context.getBean(Country.class);
		
		//System.out.println(c);
		
		Employee emp= context.getBean(Employee.class);
		System.out.println(emp);
		
		
		
		

	}

}
