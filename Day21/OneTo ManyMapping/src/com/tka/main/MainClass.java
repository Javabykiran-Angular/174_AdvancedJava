package com.tka.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Address;
import com.tka.entity.Person;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Address.class);
		config.addAnnotatedClass(Person.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		
		session.beginTransaction();
		
//		Address add1=new Address("JM Road","Pune");
//		Address add2=new Address("KarveNagar","Pune");
//		Address add3=new Address("Warje","Pune");
//		Address add4=new Address("Chinchwad","Pune");
		
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		session.persist(add4);
		
//		Address add1= session.get(Address.class, 1);
//		Address add2=session.get(Address.class, 2);
		
//		ArrayList<Address> list=new ArrayList<Address>();
//		list.add(add1);
//		list.add(add2);
		
//		Person p=new Person();
//		p.setName("Sumit");
//		p.setListaddress(list);
		
	//	session.persist(p);
		
		Person p1= session.get(Person.class, 2);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(p1);
		

	}

}
