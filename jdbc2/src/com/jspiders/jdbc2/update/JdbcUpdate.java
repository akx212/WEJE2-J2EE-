package com.jspiders.jdbc2.update;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUpdate {

	private static Connection connection;
	private static Statement statement;
	private static int result;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				fileReader = new FileReader("E:\\WEJE2\\"+"jdbc2\\resources\\"+"db_info.properties");
				properties.load(fileReader);
				
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2", properties);
				statement=connection.createStatement();
				result=statement.executeUpdate("update student set name='vish' where id=5");
				
				System.out.println(result+"row(s)affected");

//				while (resultSet.next()) {
//					System.out.println(resultSet.getInt(1)+"|"+ resultSet.getString(2)+"|"+resultSet.getString(3));
//				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
	         e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
//			if (resultSet != null) {
//				try {
//					resultSet.close();
//				} catch (SQLException e2) {
//					e2.printStackTrace();
//				}
//			}
		}
	}
}
