package com.autowire.autodetect;

public class Category {

	private String name;
	private Policy policy;
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
	
	public void getData() {
		System.out.println("name: "+ name);
		System.out.println("Policy name: "+policy.getPolicyName());
		System.out.println("Rate: "+ policy.getPolicyRate());
	}
}
