package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();  //create object of configuration
		configuration.configure("hibernate.cfg.xml");		// call configure method and pass cfg.xml file
		SessionFactory sessionFactory = configuration.buildSessionFactory(); 
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		//Above steps mandatory
		
		//insert data into student object
		Student student = new Student();
		student.setFirstname("Shashikant");
		student.setLastname("Maskar");
		student.setCity("Hydrabad");
		
		//call save method using session object
		session.save(student);
		//transaction.commit();
		//close session
		session.close();
		System.out.println("Record is inserted...!");
		
	}
}
