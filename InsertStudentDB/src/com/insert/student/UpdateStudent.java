package com.insert.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studId = request.getParameter("id");   // get Id from Show all record page(Edit)
		int stud_Id = Integer.parseInt(studId);			// Convert String id into integer
		List<Student> studentList = StudentOperations.getSingleRecord(stud_Id);		//Call method for get particular record
		for(Student s : studentList) {		// now all records available in s 
			
			// now set all fields using setAttribute
			request.setAttribute("id", s.getId());
			request.setAttribute("first", s.getFirstname());
			request.setAttribute("last", s.getLastname());
			request.setAttribute("add", s.getAddress());
			request.setAttribute("city", s.getCity());
			request.setAttribute("salary", s.getSalary());
		}
		// send the request to UpdateStudent.jsp page
		RequestDispatcher rd = request.getRequestDispatcher("UpdateStudent.jsp");
		rd.forward(request, response);
						
	}


}
