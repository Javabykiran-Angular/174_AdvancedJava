package com.tka.opeartion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tka.entity.Song;

public class InsertOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  <property name="hbm2ddl.auto">update</property>
			
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		// persist => hibernate 6.0.0
		// hibernate 5.0.0=> save
		
		Song s=new Song();
//		s.setName("Apana bana le..");
//		s.setArtist("Arjit Singh");
		
		s.setName("Humma1 Humma1");
		s.setArtist("Sumit");
		
		session.persist(s);
		
		session.getTransaction().commit();
		
		session.close();
		
		

	}

}
