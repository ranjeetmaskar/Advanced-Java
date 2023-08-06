package com.insert.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updateStud")
public class updateStud extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int sId = Integer.parseInt(id);
		String firstname = request.getParameter("first");
		String lastname = request.getParameter("last");
		String address = request.getParameter("add");
		String city = request.getParameter("city");
		String salary = request.getParameter("salary");
		
		Student student = new Student();
		
		//System.out.println(student.getId());
		student.setId(sId);
		student.setFirstname(firstname);
		student.setLastname(lastname);
		student.setAddress(address);
		student.setCity(city);
		student.setSalary(salary);
		
		StudentOperations.updateStudent(student);
	}

}
