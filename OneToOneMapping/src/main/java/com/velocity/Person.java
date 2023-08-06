//One person has one transactions (one to one mapping)

package com.velocity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")			//database table name
public class Person {

	@Id			//declare Primary key
	@GeneratedValue(strategy=GenerationType.AUTO)		//Auto increment id
	private int id;
	@Column(name="firstname")
	private String name;
	private String email;
	private String mobile;
	
	
	@OneToOne(targetEntity=Transactions.class, cascade=CascadeType.ALL)
	private Transactions transactions;		//declare pk field from Transactions here bacome FK 
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setTransactions(Transactions transactions) {
		this.transactions = transactions;
	}
	public Transactions getTransactions() {
		return transactions;
	}
}
