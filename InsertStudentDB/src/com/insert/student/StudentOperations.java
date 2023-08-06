package com.insert.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

public class StudentOperations {

	public static void save(Student student) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBConnection.getConnection();
			preparedStatement = connection.prepareStatement("insert into employeedemo(firstname,lastname,address,city,salary)values(?,?,?,?,?)");
			
			preparedStatement.setString(1, student.getFirstname());
			preparedStatement.setString(2, student.getLastname());
			preparedStatement.setString(3, student.getAddress());
			preparedStatement.setString(4, student.getCity());
			preparedStatement.setString(5, student.getSalary());
			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			connection.close();
			preparedStatement.close();
		}
	}
	
	public static List<Student> getAllData(){
		List<Student> studList= new ArrayList<Student>();
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from employeedemo");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Student student = new Student();
				student.setId(resultSet.getInt(1));
				student.setFirstname(resultSet.getString(2));
				student.setLastname(resultSet.getString(3));
				student.setAddress(resultSet.getString(4));
				student.setCity(resultSet.getString(5));
				student.setSalary(resultSet.getString(6));
				
				studList.add(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studList;
	}
	
	public static int studentDelete(int id) {
		int deleteRecord=0;
		try {
			Connection connection = DBConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement("delete from employeedemo where id = ?");
			preparedStatement.setInt(1, id);
			deleteRecord = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleteRecord;
	}
	
	public static void updateStudent(Student student) {
		//Student student = new Student();
		try {
			Connection connection = DBConnection.getConnection();
PreparedStatement preparedStatement = connection.prepareStatement("update employeedemo set firstname=?,lastname=?,address=?,city=?,salary=?"
					+ " where id= ?");
			
			preparedStatement.setString(1, student.getFirstname());
			preparedStatement.setString(2, student.getLastname());
			preparedStatement.setString(3, student.getAddress());
			preparedStatement.setString(4, student.getCity());
			preparedStatement.setString(5, student.getSalary());
			preparedStatement.setInt(6, student.getId());
			preparedStatement.executeUpdate();
			
			System.out.println("Record updated...!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Student> getSingleRecord(int stud_Id) {
		List<Student> sList = new ArrayList<Student>();
		try {
			Connection con = DBConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("select * from employeedemo where id = ?");
			ps.setInt(1, stud_Id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setFirstname(rs.getString(2));
				student.setLastname(rs.getString(3));
				student.setAddress(rs.getString(4));
				student.setCity(rs.getString(5));
				student.setSalary(rs.getString(6));
				sList.add(student);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sList;
		
	}
}