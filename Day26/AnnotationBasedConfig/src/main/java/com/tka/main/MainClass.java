package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
	//	Employee emp= context.getBean(Employee.class);
		
	//	Employee emp= context.getBean("e_1", Employee.class);
		
		Employee emp= context.getBean("e_2", Employee.class);
		
		//Employee e2= context.getBean(Employee.class);
		
		System.out.println(emp);
		//System.out.println(e2);
		
		

	}

}
