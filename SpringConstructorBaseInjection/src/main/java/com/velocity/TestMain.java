package com.velocity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student) applicationContext.getBean("r");
		//System.out.println("Name: "+ student);
		//Call getSpringMsg() method
		student.getSpringMsg("Jeet");
	}

}
