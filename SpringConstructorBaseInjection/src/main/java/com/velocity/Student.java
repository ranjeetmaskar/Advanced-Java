package com.velocity;

public class Student {

	private String city;
	private String mobile;
	
	public Student(String city, String mobile) {
		this.city = city;
		this.mobile = mobile;
	}
	
	public void getSpringMsg(String name) {
		System.out.println("I am "+ name + ", I am from "+ city+ ", My mob number is: "+ mobile);
	}

	@Override
	public String toString() {
		return "Student [city=" + city + ", mobile=" + mobile + "]";
	}
	
	
}
