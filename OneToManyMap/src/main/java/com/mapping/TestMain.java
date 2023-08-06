package com.mapping;

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
		
		//Set BankAccount class fields
		User user = new User();
		BankAccount bankAccount = new BankAccount("60188168246", "Current", user);
		BankAccount bankAccount2 = new BankAccount("98765464784", "Saving", user);
//		BankAccount bankAccount3 = new BankAccount("45687564784", "Saving", user);
		
		Set<BankAccount> set = new HashSet<BankAccount>();			//Create empty new hashset
		set.add(bankAccount);
		set.add(bankAccount2);
		//set.add(bankAccount3);
		
		user.setName("Ranjeet");
		user.setMobile("7798342096");
//		user.setBankAccount(set);
		
		session.save(user);
		session.save(bankAccount);
		session.save(bankAccount2);
//		session.save(bankAccount3);
		transaction.commit();
		session.close();
		
	}

}
