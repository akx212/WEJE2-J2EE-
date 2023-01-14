package com.jspiders.servlet3.Forms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentInfo
 */
@WebServlet("/Information")
public class StudentInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static Connection connection;
	private static PreparedStatement statement;
	private static String query;
	private static int result;
	private static String driverpath="com.mysql.cj.jdbc.Driver";
	      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfo() {
        super();   
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Class.forName(driverpath);
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2","root","root");
			query="insert into student1 values(?,?,?,?,?,?,?)";
			
			statement=connection.prepareStatement(query);
			
			statement.setString(1, request.getParameter("fname"));
			statement.setString(2, request.getParameter("lname"));
			statement.setString(3, request.getParameter("dob"));
			statement.setString(4, request.getParameter("email"));
			statement.setString(5, request.getParameter("contact"));
			statement.setString(6, request.getParameter("city"));
			statement.setString(7, request.getParameter("gender"));


			result = statement.executeUpdate();
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			
			if (result != 0) {
				writer.println(result +"Details Add In Databse");
			} else {
			
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
//		System.out.println("Hello Servlet......");
//		response.setContentType("text/html");
//		PrintWriter writer = response.getWriter();
//		
//		String fname = request.getParameter("fname");
//		String lname = request.getParameter("lname");
//		String dob = request.getParameter("dob");
//		String email = request.getParameter("email");
//		String contact = request.getParameter("contact");
//		String city = request.getParameter("city");
//		String gender = request.getParameter("gender");
//		
//			try {
//				Class.forName("com.mysql.cj.jdbc.Driver");
//				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?","root","root");
//				PreparedStatement preparedStatement = connection.prepareStatement("insert into student1 values(?,?,?,?,?,?,?)");
//				preparedStatement.setString(1, fname);
//				preparedStatement.setString(2, lname);
//				preparedStatement.setString(3, dob);
//				preparedStatement.setString(4, email);
//				preparedStatement.setString(5, contact);
//				preparedStatement.setString(6, city);
//				preparedStatement.setString(7, gender);			
//				int result = preparedStatement.executeUpdate();
//				if(result != 0) {						
//					
//					writer.println(result + "row(s) inserted succesfully..");
//				}
//				
//			} catch (ClassNotFoundException e) {	
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}	
	}

}
