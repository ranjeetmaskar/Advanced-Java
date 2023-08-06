package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertionOperation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee();		//Transient object: Simple or before attached to hibernate
		emp.setFirstname("Karan");
		emp.setLastname("Patil");
		emp.setCity("Dhule");
		emp.setMobile("9897967451");
		
		session.save(emp);		//Persistence Object : object After attached with hibernate
		transaction.commit();
		session.close();
		System.out.println("Inserted record Successfully...!");
	}

}
