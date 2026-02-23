package com.learning.hbn;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.hbn.entity.Student;

public class Main {

	public static void main(String[] args) {

		Student st= new Student(1, "Mukesh", "male", 23);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory= cfg.buildSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		
		session.persist(st);
		
		tx.commit();
		
		
	}

}
