package com.velocity;

import java.util.Date;

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
		//Set data in person object
		Person person = new Person();
		person.setName("Ranjeet");
		person.setEmail("ranjeet@gmail.com");
		person.setMobile("9158152660");
		
		//set data in transactions object
		Transactions transactions = new Transactions();
		transactions.setDate(new Date());		//here call Date constructor, it will get current date and time of system
		transactions.setTotal(1000);
		
		person.setTransactions(transactions);
		
		session.save(person);
		
		transaction.commit();
		session.close();
		
	}
}
