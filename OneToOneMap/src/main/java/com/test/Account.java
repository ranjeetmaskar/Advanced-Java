package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="acc_id")
	private int id;
	@Column(name="account_number")
	private String accNumber;
	@Column(name="account_type")
	private String type;
	
	public Account(String accNumber, String type) {
		this.accNumber = accNumber;
		this.type = type;
	}
	
	
}
