package com.jspiders.jdbc3.callable;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcCall {

	private static Connection connection;
	private static CallableStatement callableStatement;
	private static ResultSet resultSet;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String query;
	private static String filePath="E:\\\\WEJE2\\\\Jdbc3\\\\resources\\\\db_info.properties";
	
	public static void main(String[] args) {
		
		try {
			fileReader =  new FileReader(filePath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"),properties);
			query="call proc1()";
			
			callableStatement = connection.prepareCall(query);
			resultSet=callableStatement.executeQuery();
			
			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+"|"+resultSet.getString(2)+"|"+resultSet.getString(3));
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (callableStatement != null) {
				try {
					callableStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
