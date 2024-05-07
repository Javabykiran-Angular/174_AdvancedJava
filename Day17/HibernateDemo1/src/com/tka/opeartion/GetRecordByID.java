package com.tka.opeartion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class GetRecordByID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		
		session.beginTransaction();
		
		int id=2;
		
		Song song= session.get(Song.class, id);
		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(song);
		
		
		

	}

}
