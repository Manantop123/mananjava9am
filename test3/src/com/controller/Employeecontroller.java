package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.employee;
import com.dao.employeedao;

/**
 * Servlet implementation class Employeecontroller
 */
@WebServlet("/Employeecontroller")
public class Employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("insert"))
		{
			employee e = new employee();
			e.setFname(request.getParameter("fname"));
			employeedao.insertemployee(e);
			response.sendRedirect("show.jsp");
			//System.out.println(request.getParameter("fname"));
		}
	}

}
