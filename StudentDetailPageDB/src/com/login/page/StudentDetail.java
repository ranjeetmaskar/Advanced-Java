package com.login.page;

import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentDetail")
public class StudentDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) {
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String salary = request.getParameter("salary");
		
		Student student = new Student();
		student.setFirstname(firstname);
		student.setLastname(lastname);
		student.setSalary(salary);
		
		
			DatabaseConnectionInsertion.save(student);//Call the method
//		RequestDispatcher rd = request.getRequestDispatcher("StudentDetails.jsp");
//		rd.forward(request, response);
	}
}
