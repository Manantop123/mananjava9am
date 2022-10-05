package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servletlifecycle
 */
@WebServlet("/servletlifecycle")
public class servletlifecycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	public void init()
	{
		System.out.println("init initialized");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("doget method called");
		out.println("get method called");
	}
	
	public void destroy()
	{
		System.out.println("destroy");
	}
	

}
