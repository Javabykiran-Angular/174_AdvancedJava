package com.tka.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.tka.entity.Song;

import jakarta.persistence.Query;

public class UpdateHQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");		
		config.addAnnotatedClass(Song.class);
		
		SessionFactory factory= config.buildSessionFactory();
		Session session= factory.openSession();
		session.beginTransaction();
		
		String hqlQuery="update Song set artist=:myartist where id=:id";
		
		// Hibernate 5
//		Query query= session.createQuery(hqlQuery,Song.class);
//		query.setParameter("myartist", "Sumit");
//		query.setParameter("id", 3);
//		
//		query.executeUpdate();
		
		//Hibernate 6
		MutationQuery mQuery= session.createMutationQuery(hqlQuery);
		mQuery.setParameter("myartist", "Sumit");
		mQuery.setParameter("id", 3);
		mQuery.executeUpdate();
		
		session.getTransaction().commit();
		session.close();

	}

}
