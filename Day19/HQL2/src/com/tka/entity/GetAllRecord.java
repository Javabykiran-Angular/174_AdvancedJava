package com.tka.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;
//import org.hibernate.query.Query;

public class GetAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		
		session.beginTransaction();
		String hqlQuery="from Song";
		
//		//Use Query Object of Hibernate Package
//		
//		Query<Song> query= session.createQuery(hqlQuery,Song.class);
//		List<Song> list= query.list();
		
		// Jakarta package
		Query query= session.createQuery(hqlQuery,Song.class);
		
		List<Song> list= query.getResultList();
		
		
		session.getTransaction().commit();
		session.close();
		
		for(Song s:list) {
			System.out.println(s);
		}
		
		
		
		
		

	}

}
