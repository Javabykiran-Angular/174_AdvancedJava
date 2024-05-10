package com.tka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Laptop1;
import com.tka.entity.Student1;

public class MainMantyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Laptop1.class);
		config.addAnnotatedClass(Student1.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();		
		session.beginTransaction();
		
		Laptop1 lapi1=new Laptop1("Dell");
		Laptop1 lapi2=new Laptop1("Hp");
		Laptop1 lapi3=new Laptop1("Accer");
		Laptop1 lapi4=new Laptop1("Mac");
		
//		session.persist(lapi1);
//		session.persist(lapi2);
//		session.persist(lapi3);
//		session.persist(lapi4);
		
		Student1 s=new Student1();
		//s.setName("Sumit");
		s.setName("Aniket");
		
		Laptop1 l= session.get(Laptop1.class, 2);
		s.setLaptop(l);
	//	session.persist(s);
		
		Student1 stud= session.get(Student1.class, 2);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(stud);
		

	}

}
