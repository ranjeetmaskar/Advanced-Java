package com.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//		Employee employee = (Employee) applicationContext.getBean("e");
//		employee.getData();
		
		
		//Drivers class
		Drivers drivers = (Drivers) applicationContext.getBean("d");
		drivers.show();
	}

}
