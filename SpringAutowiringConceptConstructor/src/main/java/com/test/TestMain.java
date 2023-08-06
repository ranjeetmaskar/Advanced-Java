package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMain {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Categories categories = (Categories) beanFactory.getBean("c");
		categories.getDisplayData();
	}
}
