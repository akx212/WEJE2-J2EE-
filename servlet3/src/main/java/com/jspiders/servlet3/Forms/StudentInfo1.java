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
 * Servlet implementation class StudentInfo1
 */
@WebServlet("/formation")
public class StudentInfo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfo1() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
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
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2" ,"root","root");
			PreparedStatement preparedStatement = connection.prepareStatement("insert into student1 values(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, fname);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, dob);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, contact);
			preparedStatement.setString(6, city);
			preparedStatement.setString(7, gender);
			
			int executeUpdate = preparedStatement.executeUpdate();
			writer.println(executeUpdate + "row(s) inserted succesfully..");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
