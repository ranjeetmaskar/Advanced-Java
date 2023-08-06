package com.test;

public class Categories {

	private String name;
	private Policy policy;
	
	public Categories(String name, Policy policy) {
		this.name = name;
		this.policy = policy;
	}



	public void getDisplayData() {
		System.out.println("Category name: "+ name);
		System.out.println("Policy name: "+ policy.getPolicyName());
		System.out.println("Policy Amount: "+ policy.getPolicyRate());
	}
}
