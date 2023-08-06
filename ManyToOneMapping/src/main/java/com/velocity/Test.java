package com.velocity;

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
		
		Employee employee = new Employee();
		employee.setName("Jeet");
		employee.setMobile("9158152660");
		employee.setEmail("jeet@gmail.com");
		
		Employee employee1 = new Employee();
		employee1.setName("Shashi");
		employee1.setMobile("7875785810");
		employee1.setEmail("shashi@gmail.com");
		
		Address address = new Address();
		address.setCity("Pune");
		address.setState("Karnataka");
		address.setCountry("India");
		address.setPincode("416506");
		
		employee.setAddress(address);
		employee1.setAddress(address);
		
		session.save(employee);
		session.save(employee1);
		transaction.commit();
		session.close();
		sessionFactory.close();
		
	}

}
