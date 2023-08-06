package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

@SuppressWarnings("deprecation")
public class Drivers {

	private String driverClass;
	private String driverUrl;
	private String driverUsername;
	private String driverPassword;
	public String getDriverClass() {
		return driverClass;
	}
	
	
	@Required
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	
	@Required
	public void setDriverUrl(String driverUrl) {
		this.driverUrl = driverUrl;
	}
	
	public void setDriverUsername(String driverUsername) {
		this.driverUsername = driverUsername;
	}
	
	public void setDriverPassword(String driverPassword) {
		this.driverPassword = driverPassword;
	}
	
	public void show() throws ClassNotFoundException, SQLException {
		 Class.forName(driverClass);
		 Connection connection = DriverManager.getConnection(driverUrl, driverUsername, driverPassword);
		 System.out.println(connection);
	}
	
}
