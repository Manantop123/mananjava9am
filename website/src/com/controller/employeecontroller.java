package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import com.bean.employee;
import com.dao.empdao;
import com.util.emputil;

/**
 * Servlet implementation class employeecontroller
 */
@WebServlet("/employeecontroller")
public class employeecontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		System.out.println(action);
		
		if(action.equalsIgnoreCase("insert"))
		{
			employee e = new employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setGender(request.getParameter("gender"));
			e.setEmailid(request.getParameter("emailid"));
			e.setMobile(Long.parseLong(request.getParameter("mobile")));
			e.setPassword(request.getParameter("password"));
			e.setCpassword(request.getParameter("cpassword"));
			empdao.insertemployee(e);
			response.sendRedirect("show.jsp");
			
		}	
//			System.out.println(request.getParameter("fname"));
//			System.out.println(request.getParameter("lname"));
//			System.out.println(request.getParameter("gender"));
//			System.out.println(request.getParameter("email"));
//			System.out.println(request.getParameter("mobile"));
//			System.out.println(request.getParameter("psw"));
//			System.out.println(request.getParameter("cpsw"));
			
			else if(action.equalsIgnoreCase("edit"))
			{
				int id = Integer.parseInt(request.getParameter("id"));
				//System.out.println(id);
				employee e1 = empdao.getemployeebyid(id);
				request.setAttribute("emp", e1);
				request.getRequestDispatcher("update.jsp").forward(request, response);
			}
			else if(action.equalsIgnoreCase("update"))
			{
				employee e = new employee();
				e.setFname(request.getParameter("fname"));
				e.setLname(request.getParameter("lname"));
				e.setGender(request.getParameter("gender"));
				e.setEmailid(request.getParameter("emailid"));
				e.setMobile(Long.parseLong(request.getParameter("mobile")));
				e.setPassword(request.getParameter("password"));
				e.setCpassword(request.getParameter("cpassword"));
				e.setId(Integer.parseInt(request.getParameter("id")));
				empdao.updatemployee(e);
				response.sendRedirect("show.jsp");
			}
			else if(action.equalsIgnoreCase("delete"))
			{
				int  id = Integer.parseInt(request.getParameter("id"));
				System.out.println(id);
				
				empdao.deleteemployee(id);
				response.sendRedirect("show.jsp");
				
			}
		}

}
