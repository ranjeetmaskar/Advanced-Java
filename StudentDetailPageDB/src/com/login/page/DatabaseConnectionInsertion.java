package com.login.page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.Request;

import com.mysql.cj.protocol.Resultset;

public class DatabaseConnectionInsertion {

	public static Connection getConnectionDetails() {
		Connection connection = null; // increase the scope of connection
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Ranjeet@123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	// insert the data in database
	public static void save(Student student) {
		Connection con = null;
		PreparedStatement preparedStatement = null;
		try {
			con = getConnectionDetails();
			preparedStatement = con.prepareStatement("insert into student(firstname,lastname,salary)values(?,?,?)");
			preparedStatement.setString(1, student.getFirstname());
			preparedStatement.setString(2, student.getLastname());
			preparedStatement.setString(3, student.getSalary());

			preparedStatement.executeUpdate();
			//System.out.println("Record inserted");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static List<Student> getAllRecords(){
		//Connection connection = null;
		// PreparedStatement preparedStatement = null;
		List<Student> studentList = new ArrayList<Student>();			//create empty arrayList for store student
		try {
			
			Connection connection = getConnectionDetails();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from student");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				//create object of Student class for storing data
				Student student = new Student();
				student.setId(resultSet.getInt(1));//get Id and store into Student class Id
				student.setFirstname(resultSet.getString(2));
				student.setLastname(resultSet.getString(3));
				student.setSalary(resultSet.getString(4));
				//Above student object stores all the data
				//Below student object data add in studentList
				studentList.add(student); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}
	
	public static int studentDelete(int id) {
		int deleteRecord=0;
		try {
			Connection connection = getConnectionDetails();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from student where id=?");
			preparedStatement.setInt(1, id);
			deleteRecord=preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteRecord;
	}
}
