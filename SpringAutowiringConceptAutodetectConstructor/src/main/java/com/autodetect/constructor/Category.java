package com.autodetect.constructor;

public class Category {

	private String name;
	private Policy policy;
	
	
	public Category(String name, Policy policy) {
		this.name = name;
		this.policy = policy;
	}
	
	public void show() {
		System.out.println("Name: "+name);
		System.out.println("Policy name: "+policy.getPlanName());
		System.out.println("Rate: "+ policy.getPlanRate());
	}
}
