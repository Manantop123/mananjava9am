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
		System.out.println(action);
		
		if(action.equalsIgnoreCase("insert"))
		{
			employee e1 = new employee();
			e1.setFname(request.getParameter("fname"));
			e1.setLname(request.getParameter("lname"));
			e1.setEmail(request.getParameter("email"));
			e1.setMobile(Long.parseLong(request.getParameter("mobile")));
			e1.setGender(request.getParameter("gender"));
			e1.setPassword(request.getParameter("psw"));
			e1.setCpassword(request.getParameter("cpsw"));
			empdao.insertemployee(e1);
			response.sendRedirect("show.jsp");
//			System.out.println(request.getParameter("fname"));
//			System.out.println(request.getParameter("lname"));
//			System.out.println(request.getParameter("email"));
//			System.out.println(request.getParameter("mobile"));
//			System.out.println(request.getParameter("gender"));
//			System.out.println(request.getParameter("psw"));
//			System.out.println(request.getParameter("cpsw"));
		}
	}

}
