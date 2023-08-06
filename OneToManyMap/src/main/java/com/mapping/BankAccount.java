package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="acc_id")
	private int id;
	@Column(name="acc_number")
	private String accNo;
	@Column(name="acc_type")
	private String type;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;

	public BankAccount(String accNo, String type, User user) {
		super();
		this.accNo = accNo;
		this.type = type;
		this.user = user;
	}
	
	
}
