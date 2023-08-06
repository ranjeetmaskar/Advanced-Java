package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		User user1 = new User();
		user1.setName("Jaysing");
		user1.setMobile("9049957739");
		
		User user2 = new User();
		user2.setName("Santosh");
		user2.setMobile("9876543210");
		
		Nominee nominee1 = new Nominee();
		nominee1.setName("shashi");
		nominee1.setCity("Kolhapur");
		
		Nominee nominee2 = new Nominee();
		nominee2.setName("Ranjeet");
		nominee2.setCity("Pune");
		
		Nominee nominee3 = new Nominee();
		nominee3.setName("Karan");
		nominee3.setCity("Hydrabad");
		
		user1.getNomineeList().add(nominee1);	// 1 1
		user1.getNomineeList().add(nominee2);	// 1 2
		user1.getNomineeList().add(nominee3);	// 1 3
		
//		nominee1.getUserList().add(user1);
//		nominee2.getUserList().add(user1);
//		nominee3.getUserList().add(user1);
		
		user2.getNomineeList().add(nominee3);	// 2 3
		user2.getNomineeList().add(nominee1);	// 2 1
		
//		nominee1.getUserList().add(user2);
//		nominee3.getUserList().add(user2);
		
		session.save(user1);
		session.save(user2);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
}
