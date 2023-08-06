package com.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertionTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//create object pojo class and set records
		Student student = new Student();
		student.setName("jeet");
		student.setCity("maskar");
		
		//using save method and insert records in db
		session.save(student);
		transaction.commit();	//when use update in(hbm2ddl.auto) then this step mandatory
		session.close();
		
		System.out.println("Record Inserted...!");
	}

}
