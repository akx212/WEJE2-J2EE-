package com.jspiders.servlet1.classes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet2 extends HttpServlet{

	private static final  long serialVersionUID = 1l;
	
	public DemoServlet2() {
		super();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		responce.setContentType("text/html");
		PrintWriter writer = responce.getWriter();
		writer.println("<h1> Hello from DemoServlet2 </h1>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse responce) throws ServletException, IOException {
		responce.setContentType("text/html");
		PrintWriter writer = responce.getWriter();
		writer.println("<h1> Hello from DemoServlet2 </h1>");
	}
}
