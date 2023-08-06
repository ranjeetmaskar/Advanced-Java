package com.autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Here we need to create Bean Factory object 
		//Resource interface object
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Categories categories = (Categories) beanFactory.getBean("r");
		categories.getDisplayData();
	}

}
