package test2.controller;

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
		System.out.println("init called");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("doget method called for console");
		out.println("doget method called for browser");
	}

	public void destroy()
	{
		System.out.println("destroy called");
	}
}
