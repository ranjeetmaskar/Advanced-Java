package com.checking;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Resource resource= new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employee= (Employee) beanFactory.getBean("e");
		employee.getShow();
		
	}
}
