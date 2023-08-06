package com.student;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class GetTest {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Student");		//here mentioned Class name not database table name
		List<Student> studList = query.list();	//call list() using Query object
		//Iterate studList using for each loop
		for(Student s: studList) {
			//Show data
			System.out.println("Id>>"+s.getId());
			System.out.println("Name>>"+ s.getName());
			System.out.println("City>>"+s.getCity());
		}
		transaction.commit();
		session.close();
	}

}
