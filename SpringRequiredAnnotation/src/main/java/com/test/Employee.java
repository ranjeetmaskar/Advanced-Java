package com.test;

import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String firstname;
	private String lastname;
	private String city;
	private String mobile;
	private String country;
	
	@SuppressWarnings("deprecation")
	@Required
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	@SuppressWarnings("deprecation")
	@Required
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void getData() {
		System.out.println("Firstname: "+ firstname);
		System.out.println("Lastname: "+ lastname);
		System.out.println("City: "+ city);
		System.out.println("Mobile No.: "+ mobile);
		System.out.println("Country: "+ country);
		
	}
	
}
