package com.velocity;

import org.hibernate.Query;
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
		
		
		Customer customer1 = new Customer();
		customer1.setName("Babalya");
		customer1.setEmail("babalya@gmail.com");
		customer1.setMobile("4556122378");
		
		Customer customer2 = new Customer();
		customer2.setName("Pradeep");
		customer2.setEmail("pradeep@gmail.com");
		customer2.setMobile("9632587410");
		
		
		Nominee nominee1 = new Nominee();
		nominee1.setName("Jeet");
		nominee1.setEmail("jeet@gmail.com");
		nominee1.setMobile("9158152660");
		
		Nominee nominee2 = new Nominee();
		nominee2.setName("Shashi");
		nominee2.setEmail("shashi@gmail.com");
		nominee2.setMobile("8888220903");
		
		Nominee nominee3 = new Nominee();
		nominee3.setName("Amol");
		nominee3.setEmail("amol@gmail.com");
		nominee3.setMobile("7531984620");

		customer1.getNomineeList().add(nominee3);
		customer1.getNomineeList().add(nominee2);
		customer1.getNomineeList().add(nominee1);
		nominee3.getCustomerList().add(customer1);
		nominee2.getCustomerList().add(customer1);
		nominee1.getCustomerList().add(customer1);
		
		customer2.getNomineeList().add(nominee1);
//		customer2.getNomineeList().add(nominee2);
		customer2.getNomineeList().add(nominee3);		
		nominee1.getCustomerList().add(customer2);
//		nominee2.getCustomerList().add(customer2);
		nominee3.getCustomerList().add(customer2);
		
		
		session.save(customer1);
		session.save(customer2);
		
		transaction.commit();
		session.close();
		sessionFactory.close();
	}

}
