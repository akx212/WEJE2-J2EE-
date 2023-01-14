package com.jspiders.jdbc4.delete;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.jspiders.jdbc4.entity.Student;

public class JdbcDelete {
	
	private static Connection connection;
	private static PreparedStatement preparedStatememt;
	private static int result;
	private static Properties properties = new Properties();
	private static FileReader fileReader;
	private static String filePath ="E:\\WEJE2\\Jdbc3\\resources\\db_info.properties";
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filePath);
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection(properties.getProperty("dburl"), properties);
			
			query="delete from student where id=1";
			preparedStatememt=connection.prepareStatement(query);
			int result=preparedStatememt.executeUpdate();
			
//			while(resultSet.next()) {
//				Student student= new Student();
//				student.setId(resultSet.getInt(1));
//				student.setName(resultSet.getString(2));
//				student.setEmail(resultSet.getString(3));
//				
//				System.out.println(student);
//			}
			Student student= new Student();
//			System.out.println(student);
			System.out.println(result+ "row(s) delete");
			
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
			if (preparedStatememt != null) {
				try {
					preparedStatememt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
//			if (resultSet != null) {
//				try {
//					resultSet.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
		}

}
}
