package com.student;

public class Student {

	private String city;
	private String mobile;
	
	public void setCity(String city) {
		this.city = city;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void getMassage(String name) {
		System.out.println("Hello, I am "+name+", I belongs to "+city+" & mobile number is: "+ mobile);
	}
}
