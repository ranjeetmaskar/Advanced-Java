package com.test;

public class Policy {

	private String policyName;
	private int policyRate;
	
	
	public Policy(String policyName, int policyRate) {
		this.policyName = policyName;
		this.policyRate = policyRate;
	}

	public String getPolicyName() {
		return policyName;
	}
	
	public int getPolicyRate() {
		return policyRate;
	}

	
}
