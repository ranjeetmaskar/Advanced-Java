package com.velocity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String policyID;
	private String policyType;
	private String status;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public Policy(String policyID, String policyType, String status, User user) {

		this.policyID = policyID;
		this.policyType = policyType;
		this.status = status;
		this.user = user;
	}

	
	
	
}
