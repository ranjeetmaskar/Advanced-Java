package com.insert.student;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertStudent")
public class InsertStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String firstname = request.getParameter("first");
		String lastname = request.getParameter("last");
		String address = request.getParameter("add");
		String add = request.getParameter("add");
		String city = request.getParameter("city");
		String salary = request.getParameter("salary");

		Student student = new Student();
		student.setFirstname(firstname);
		student.setLastname(lastname);
		student.setAddress(address);
		student.setCity(city);
		student.setSalary(salary);

		try {
			StudentOperations.save(student);
			request.setAttribute("f", firstname);
			request.setAttribute("l", lastname);
			request.setAttribute("a", add);
			request.setAttribute("c", city);
			request.setAttribute("s", salary);
			
			//It is used to send/navigate request to another resource(HTML,JSP,Servlet)
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp"); 
			rd.forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
