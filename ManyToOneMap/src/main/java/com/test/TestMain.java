package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Rajan");
	
		Employee e2 = new Employee();
		e2.setName("Jayant");
		
		Address address = new Address();
		address.setCity("Kolahapur");
		address.setCountry("India");
		
		e1.setAddress(address);
		e2.setAddress(address);
		
		session.save(e1);
		session.save(e2);
		transaction.commit();
		session.close();
	}
}
