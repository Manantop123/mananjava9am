package com.controller;

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
		System.out.println("action");
		
		if(action.equalsIgnoreCase("insert"))
		{
			//System.out.println(request.getParameter("fname"));
			//System.out.println(request.getParameter("lname"));
			employee e = new employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			empdao.insertemployee(e);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			//System.out.println(id);
			
			employee e = empdao.getemployeebyid(id);
			request.setAttribute("emp", e);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			employee e = new employee();
			e.setId(Integer.parseInt(request.getParameter("id")));
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			empdao.updateemployee(e);
			response.sendRedirect("show.jsp");
			
		}
		else if(action.equalsIgnoreCase("delete"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			//System.out.println(id);
			
			empdao.deletemployee(id);
			response.sendRedirect("show.jsp");
		}
	}

}
