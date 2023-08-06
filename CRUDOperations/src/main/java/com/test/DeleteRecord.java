package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = (Employee) session.load(Employee.class, 4);
		session.delete(employee);
		transaction.commit();
		session.close();
		System.out.println("Record delete successfully...!");
	}
}
