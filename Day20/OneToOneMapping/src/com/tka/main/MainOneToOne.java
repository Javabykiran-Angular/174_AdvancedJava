package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop;
import com.tka.entity.Student;

public class MainOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Student.class);
		config.addAnnotatedClass(Laptop.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();		
		session.beginTransaction();
		
		Laptop lapi=new Laptop("Dell");
		
		Student stud=new Student();
		stud.setName("Sumit");
		stud.setLaptop(lapi);
	//	session.persist(lapi);
		
	//	session.persist(stud);
		
		Student s= session.get(Student.class, 1);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(s);
		

	}

}
