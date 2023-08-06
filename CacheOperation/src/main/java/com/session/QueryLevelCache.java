package com.session;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QueryLevelCache {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		//Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Student");
		query.setCacheable(true);				//if u want to one query again and again then setCacheable true
		List<Student> studList = query.list();
		for(Student s: studList) {
			System.out.println("Id>>"+s.getId());
			System.out.println("Name>>"+s.getName());
			System.out.println("City>>"+s.getCity());
		}
		
		session.close();
	}

}
