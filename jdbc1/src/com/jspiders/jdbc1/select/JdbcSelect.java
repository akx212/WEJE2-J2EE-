package com.jspiders.jdbc1.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
     private static Connection connection;
     private static Statement statement;
     private static ResultSet resultSet;
     
     public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?"
			                                               +"user=root&password=root");
				statement = connection.createStatement();
				resultSet = statement.executeQuery("select* from student");
				while (resultSet.next()) {
					System.out.println(resultSet.getInt(1)+"|"+resultSet.getString(2)+"|"
				                                              +resultSet.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if (connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement!=null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet!=null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
