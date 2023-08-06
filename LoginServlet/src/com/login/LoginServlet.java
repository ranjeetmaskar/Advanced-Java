package com.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("user");
		//System.out.println(username);
		String password = request.getParameter("pass");
		//System.out.println(password);
		if("suraj".equals(username) && "seth".equals(password)) {
			request.setAttribute("s", username);
			RequestDispatcher rd = request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("d", username);
			RequestDispatcher rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
	}

}
