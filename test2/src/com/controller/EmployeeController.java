package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Employee;
import com.dao.Employeedao;

/**
 * Servlet implementation class EmployeeController
 */
@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("registration"))
		{
			
			Employee e = new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setEmail(request.getParameter("email"));
			e.setMobile(Long.parseLong(request.getParameter("mobileno")));
			e.setAddress(request.getParameter("address"));
			e.setEmail(request.getParameter("gender"));
			Employeedao.insertdemo(e);
			response.sendRedirect("show.jsp");
			
			
//			System.out.println(request.getParameter("fname"));
//			System.out.println(request.getParameter("lname"));
//			System.out.println(request.getParameter("email"));
//			System.out.println(request.getParameter("mobileno"));
//			System.out.println(request.getParameter("psw"));
//			System.out.println(request.getParameter("cpsw"));
//			System.out.println(request.getParameter("gender"));
//			System.out.println(request.getParameter("address"));
//			System.out.println(request.getParameter("edu"));
//			System.out.println(request.getParameter("hobbies"));

		}
	}

}
