package com.checking;

public class Employee {

	private String name;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getShow() {
		System.out.println("Employee name: "+ name);
		System.out.println("Employee City: "+ address.getCity());
		System.out.println("Employee pincode: "+ address.getPincode());
	}
}
