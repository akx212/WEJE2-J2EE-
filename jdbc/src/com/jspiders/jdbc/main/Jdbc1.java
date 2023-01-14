package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:"
						+ "3306/weje2","root","root");
				
				Statement statement=connection.createStatement();
				ResultSet resultSet = statement.executeQuery("select *"+"from student");
				
				while (resultSet.next()) {
					System.out.println(resultSet.getString(1)+"|"+resultSet.getString(2)+
							"|"+resultSet.getString(3));
				}
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
