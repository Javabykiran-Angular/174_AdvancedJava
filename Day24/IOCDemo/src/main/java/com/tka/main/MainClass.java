package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tka.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee emp= context.getBean("e1", Employee.class);
		System.out.println(emp);
		Employee emp1= context.getBean("e1", Employee.class);
		System.out.println(emp1);

	}

}
