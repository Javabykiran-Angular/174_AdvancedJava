package com.tka.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="delete Song where id=:id";
		
		MutationQuery mquery= session.createMutationQuery(hqlQuery);
		mquery.setParameter("id", 2);
		
		mquery.executeUpdate();
		
		session.getTransaction().commit();
		session.close();
		
		
		

	}

}
