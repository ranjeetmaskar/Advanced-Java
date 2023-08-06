package com.test.cache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QueryCache {

	@SuppressWarnings({ "deprecation", "unchecked" })
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		//If i want to some query again and again or multiple times then we should go for Query level cache
		Query query = session.createQuery("from Employee");
		query.setCacheable(true);
		List<Employee> list = query.list();
		for (Employee employee : list) {
			System.out.println(employee.getId());
			System.out.println(employee.getFirstname());
			System.out.println(employee.getLastname());
			System.out.println(employee.getCity());
			System.out.println(employee.getMobile());
		}
		
	}

}
