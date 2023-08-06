package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Person person = new Person();
		person.setName("Jeet");
		person.setCity("Pune");
		
		Account account = new Account("60188168789", "Current");
		
		person.setAccount(account);
		
		session.save(person);
		transaction.commit();
		session.close();
		System.out.println("Done...!");
	}

}
