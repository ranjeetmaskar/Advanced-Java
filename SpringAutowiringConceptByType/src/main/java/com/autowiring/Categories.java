package com.autowiring;

public class Categories {

	private String name;
	private Policy policy;  //Secondary data type
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	
	public void getDisplayData() {
		System.out.println("Category name: "+ name);
		System.out.println("Policy name: "+ policy.getPlanName());
		System.out.println("Policy Amount: "+ policy.getPlanAmmount());
	}
}
