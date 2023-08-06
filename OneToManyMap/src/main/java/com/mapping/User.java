package com.mapping;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private int id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_mobile")
	private String mobile;
	
	@OneToMany(mappedBy="user")				//this name and in BankAccount class name line no 25 ref is same 
	private Set<BankAccount> bankAccount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Set<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Set<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	
	
	
}
