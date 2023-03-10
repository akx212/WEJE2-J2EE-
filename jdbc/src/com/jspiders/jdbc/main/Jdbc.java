package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
     public static void main(String[] args) {
		try {
			// Step 1:Load the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				// Step 2: Open the connections
				Connection connection = DriverManager.getConnection("jdbc:mysql://"+""
						+ "localhost:3306/weje2?"+"user=root&password=root");
				
				// Step 3: Create /prepare the statement
				Statement statement=connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select *"+"from student");
				
				// Step 4: Process the Result
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1)+"||"+resultSet.getString(2)+
							"||"+resultSet.getString(3));
				}
				// Step 5: Close the connections
				connection.close();
				statement.close();
				resultSet.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
     }
}
