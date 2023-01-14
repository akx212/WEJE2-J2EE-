package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsert {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");			
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://"+""
						+ "localhost:3306/weje2?"+"user=root&password=root");
				
				Statement statement=connection.createStatement();
				int result = statement.executeUpdate("insert into student values(2,'baburao','babu90@theka.com')");
				
				System.out.println(result+"row(s)affected");
				
				connection.close();
				statement.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
