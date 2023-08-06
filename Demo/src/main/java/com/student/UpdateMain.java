package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//using get() and store into Student object
		Student student = (Student) session.get(Student.class, 5);
		student.setName("Abhi");		//set new fields
		student.setCity("Satara");
		
		//using sesssion.update() and update records
		session.update(student);		
		transaction.commit();				//mandatory in update operation
		session.close();
		System.out.println("Record updated...!");
	}

}
