package com.learning.hbn;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.boot.Metadata;
	import org.hibernate.boot.MetadataSources;
	import org.hibernate.boot.registry.StandardServiceRegistry;
	import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
	import org.hibernate.cfg.Configuration;
	import org.hibernate.query.Query;

	import com.learning.hbn.configuration.HibernateConfiguration;
import com.learning.hbn.entity.Student;

	public class Main {
		public static void main(String[] args) {
			Student st = new Student();

			SessionFactory sessionFactory = HibernateConfiguration.getSessionFactory();

			Session session = sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			
			
			System.out.println(session.createQuery("from empp",Student.class).list());
			
			

//			session.load(st, 20);
//			st = session.get(Employee.class, 4);
//			System.out.println(st);
			
//			emp.setName("Mahesh");
//			session.persist(st);
//			session.persist(st2);
//			emp.setId(3);
//			session.remove(st);
			
			tx.commit();
		}

	}


