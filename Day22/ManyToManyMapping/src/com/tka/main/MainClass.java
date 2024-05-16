package com.tka.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");		
		config.addAnnotatedClass(Laptop.class);
		config.addAnnotatedClass(Student.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		
		session.beginTransaction();
		
		Laptop lapi1=new Laptop("Dell");
		Laptop lapi2=new Laptop("HP");
		Laptop lapi3=new Laptop("Accer");
		Laptop lapi4=new Laptop("Mac");
		
//		List<Laptop> list=new ArrayList<Laptop>();
//		list.add(lapi1);
//		list.add(lapi2);
		
//		Laptop lap_1= session.get(Laptop.class, 3);
//		Laptop lap_2= session.get(Laptop.class, 4);
//		
//		List<Laptop> list_lap=new ArrayList<Laptop>();
//		list_lap.add(lap_1);
//		list_lap.add(lap_2);
		
		Student stud=new Student();
		
		stud.setName("Rushi");
		
		//stud.setLaplist(list_lap);
		
//		session.persist(lapi1);
//		session.persist(lapi2);
//		session.persist(lapi3);
//		session.persist(lapi4);
		
	//	session.persist(stud);
		
		// Fetch a student Record 
		Student s= session.get(Student.class, 1);
		
		List<Laptop> s_lapList= s.getLaplist();
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(s);
		
		for(Laptop lapi:s_lapList) {
			System.out.println(lapi);
		}
		
		

	}

}
