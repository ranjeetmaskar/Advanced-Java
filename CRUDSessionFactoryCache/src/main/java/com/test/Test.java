package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		
		Employee employee = (Employee) session.get(Employee.class, 1);
		System.out.println("First student data is>>");
		System.out.println("Id>>" + employee.getId());
		System.out.println("Firstname>>" + employee.getFirstname());
		System.out.println("Lastname>>" + employee.getLastname());
		System.out.println("City>>" + employee.getCity());
		System.out.println("Mobile>>" + employee.getMobile());

		//If u have multiple session object then you should use session Factory level cache
			Employee employee2 = (Employee) session.load(Employee.class, 2);
			System.out.println("First student data is>>");
			System.out.println("Id>>" + employee2.getId());
			System.out.println("Firstname>>" + employee2.getFirstname());
			System.out.println("Lastname>>" + employee2.getLastname());
			System.out.println("City>>" + employee2.getCity());
			System.out.println("Mobile>>" + employee2.getMobile());
			
			session.close();
			System.out.println("Data fetch success...");
	}

}
