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
 * Servlet implementation class empcontroller
 */
@WebServlet("/empcontroller")
public class empcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("insert"))
		{
			employee e1 = new employee();
			e1.setFname(request.getParameter("fname"));
			e1.setEmail(request.getParameter("email"));
			e1.setGender(request.getParameter("gender"));
			e1.setPassword(request.getParameter("psw"));
			empdao.insert(e1);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			employee e1 = empdao.getbyid(id);
			request.setAttribute("emp", e1);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update"))
		{
			employee e1 = new employee();
			e1.setId(Integer.parseInt(request.getParameter("id")));
			e1.setFname(request.getParameter("fname"));
			e1.setEmail(request.getParameter("email"));
			e1.setGender(request.getParameter("gender"));
			e1.setPassword(request.getParameter("psw"));
			empdao.updatemployee(e1);
			response.sendRedirect("show.jsp");
		}
	}

}
