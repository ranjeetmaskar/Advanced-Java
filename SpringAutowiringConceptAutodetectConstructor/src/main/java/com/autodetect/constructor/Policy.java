package com.autodetect.constructor;

public class Policy {

	private String planName;
	private int planRate;
	
	
	public Policy(String planName, int planRate) {
		this.planName = planName;
		this.planRate = planRate;
	}
	
	public String getPlanName() {
		return planName;
	}
	public int getPlanRate() {
		return planRate;
	}
}
