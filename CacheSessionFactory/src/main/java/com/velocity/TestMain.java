package com.velocity;

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
		//Transaction transaction = session.beginTransaction();
		
		Student s1 = (Student) session.load(Student.class, 1);
		System.out.println("Id>>"+s1.getId());
		System.out.println("Name>>"+s1.getName());
		System.out.println("City>>"+s1.getCity());
		
		Session session2 = sessionFactory.openSession();
		Student s2 = (Student) session2.load(Student.class, 1);
		System.out.println("Id>>"+s2.getId());
		System.out.println("Name>>"+s2.getName());
		System.out.println("City>>"+s2.getCity());
	}

}
