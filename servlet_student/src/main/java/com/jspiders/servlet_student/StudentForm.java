package com.jspiders.servlet_student;

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

import com.mysql.cj.xdevapi.PreparableStatement;

/**
 * Servlet implementation class StudentForm
 */
@WebServlet("/Information")
public class StudentForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public StudentForm() {
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
		    PrintWriter writer = response.getWriter();
			
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String dob = request.getParameter("dob");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			String city = request.getParameter("city");
			String gender = request.getParameter("gender");
			
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?","root","root");
			PreparedStatement prepareStatement = connection.prepareStatement("insert into student1 values(?,?,?,?,?,?,?)");
			
			prepareStatement.setString(1,fname);
			prepareStatement.setString(2,lname);
			prepareStatement.setString(3,dob);
			prepareStatement.setString(4,email);
			prepareStatement.setString(5,contact);
			prepareStatement.setString(6, city);
			prepareStatement.setString(7, gender);
			
			int result = prepareStatement.executeUpdate();
			
			if (result != 0) {
				writer.println(result + "row(s) inserted Succesfully..");
			} 
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
