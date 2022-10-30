package com.controller;
import java.util.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.employee;
import com.dao.empdao;

/**
 * Servlet implementation class employeecontroller
 */
@WebServlet("/employeecontroller")
public class employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("insert"))
		{
			employee e1 = new employee();
			e1.setFname(request.getParameter("fname"));
			e1.setLname(request.getParameter("lname"));
			empdao.insertemployee(e1);
			response.sendRedirect("show.jsp");
//			System.out.println(request.getParameter("fname"));
//			System.out.println(request.getParameter("lname"));
		}
		if(action.equalsIgnoreCase("edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			//System.out.println(id);
			
			employee e = empdao.getemployeeById(id);
			request.setAttribute("emp",e);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
	} 
}
