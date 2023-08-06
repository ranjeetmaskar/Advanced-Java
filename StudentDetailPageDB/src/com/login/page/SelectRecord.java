package com.login.page;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SelectRecord")
public class SelectRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<h2>All Students Record:</h2>");
		List<Student> studList = DatabaseConnectionInsertion.getAllRecords();
		//System.out.println(studList);
		printWriter.print("<table border=1 width='80%'>");
		printWriter.print("<tr><th>Id</th><th>Firstname</th><th>Lastname</th><th>Salary</th></tr>");
		for(Student s : studList) {
			printWriter.print("<tr><td>"+s.getId()+"</td>"
					+ "<td>"+s.getFirstname()+"</td>"
					+ "<td>"+s.getLastname()+"</td>"
					+ "<td>"+s.getSalary()+"</td>"
					+ "<td><a href='DeleteStudent?id="+s.getId()+"'>Delete</a></td>"
					+ "<td><a href='UpdateStudent?id="+s.getId() +"'>Edit</a></td></tr>");
		}
	}

}
