package com.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetRecord {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Employee");
		List<Employee> empList = query.list();
		for(Employee emp : empList) {
			System.out.println("ID>>"+ emp.getId());
			System.out.println("Name>>"+emp.getFirstname());
			System.out.println("Lastname>>"+emp.getLastname());
			System.out.println("City>>"+emp.getCity());
			System.out.println("Mobile>>"+emp.getMobile());
		}
		
		session.close();
	}

}
