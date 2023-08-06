package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpadateRecord {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = (Employee) session.get(Employee.class, 2);
		employee.setLastname("Shelkikar");
		employee.setMobile("6666666666");
		
		session.update(employee);
		transaction.commit();
		session.close();
		System.out.println("Record updated successfully...!");
	}

}
