package com.session;

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
		
		Student student = (Student) session.get(Student.class, 6);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getCity());
		
		Student student1 = (Student) session.get(Student.class, 1);
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.getCity());
		
		session.close();
		
	}

}
