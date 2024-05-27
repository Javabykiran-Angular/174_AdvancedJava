package com.tka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tka.config.Configuration;
import com.tka.entity.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
		Person p= context.getBean(Person.class);
		
		p.getSim1().calling();
		
		p.getSim2().calling();
		
		//System.out.println(p);

	}

}
