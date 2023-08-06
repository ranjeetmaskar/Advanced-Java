package com.test.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SessionCache {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//here we are using two session objects
		Employee employee = (Employee) session.get(Employee.class, 1);
		System.out.println(employee.getId());
		System.out.println(employee.getFirstname());
		System.out.println(employee.getLastname());
		System.out.println(employee.getCity());
		System.out.println(employee.getMobile());
		
		Employee employee1 = (Employee) session.get(Employee.class, 1);
		System.out.println(employee1.getId());
		System.out.println(employee1.getFirstname());
		System.out.println(employee1.getLastname());
		System.out.println(employee1.getCity());
		System.out.println(employee1.getMobile());
		
		session.close();
	}
}
