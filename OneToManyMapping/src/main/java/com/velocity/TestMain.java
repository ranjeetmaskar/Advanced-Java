package com.velocity;

import java.util.HashSet;
import java.util.Set;

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
		
		Transaction transaction = session.beginTransaction();
		
		User user = new User();
		//set user fields
			user.setName("Suraj");
			user.setCity("KOP");
			
		//Set Policy fields	
		Policy policy1 = new Policy("P25", "Home Insurance","Active", user);
		Policy policy2 = new Policy("P30", "Bike Insurance","Inactive", user);
		
		//Add policy1 and 2 objects in Set<Policy>
		Set<Policy> set = new HashSet<Policy>();
		set.add(policy1);
		set.add(policy2);
		
		
		session.persist(user);
//		session.save(policy1);
//		session.save(policy2);
		transaction.commit();
		session.close();
	}

}
