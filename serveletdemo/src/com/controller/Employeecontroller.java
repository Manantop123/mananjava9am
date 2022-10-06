package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Employeecontroller
 */
@WebServlet("/Employeecontroller")
public class Employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("registration"))
		{
			System.out.println(request.getParameter("fname"));
			System.out.println(request.getParameter("lname"));
			System.out.println(request.getParameter("email"));
			System.out.println(request.getParameter("mobileno"));
			System.out.println(request.getParameter("psw"));
			System.out.println(request.getParameter("cpsw"));
			System.out.println(request.getParameter("gender"));
			System.out.println(request.getParameter("address"));
			System.out.println(request.getParameter("Education"));
			System.out.println(request.getParameter("hobby"));
			System.out.println(request.getParameter("action"));
		}
 	}
}
