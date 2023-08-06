package com.insert.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
