<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 String fname = request.getParameter("fname");
 String lname = request.getParameter("lname");
 String dob = request.getParameter("dob");
 String email = request.getParameter("email");
 String contact = request.getParameter("contact");
 String city = request.getParameter("city");
 String gender = request.getParameter("gender"); 
 
 
 Connection connection = null;
 PreparedStatement preparedStatement = null;
 int result = 0;
 String driverpath = "com.mysql.cj.jdbc.Driver";
 String dburl = "jdbc:mysql://localhost:3306/weje2";
 String user = "root";
 String password = "root";
 String query = "insert into student1 values(?,?,?,?,?,?,?)";
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
<fieldset>
    <legend>Student Details</legend>
   
      <table>
        <tr>
           <td><label> First Name</label></td>
           <td><%=fname %></td>
        </tr>
        <tr>
           <td><label> Last Name</label></td>
           <td><%=lname %></td>
        </tr>
        <tr>
           <td><label> DOB</label></td>
           <td><%=dob %></td>
        </tr>
        <tr>
           <td><label> Email</label></td>
           <td><%=email %></td>
        </tr>
        <tr>
           <td><label> Contact </label></td>
           <td><%=contact %></td>
        </tr>
        <tr>
           <td><label> City</label></td>
           <td><%=city %></td>
        </tr>
        <tr>
           <td><label> Gender</label></td>
           <td><%=gender %></td>
        </tr>
         <tr>
           <td><input type="Submit" name="Submit" value="SUBMIT"></td>
        </tr>
      </table>  
   
  </fieldset>
  <% 
  try {
			Class.forName(driverpath);
		    connection=DriverManager.getConnection(dburl, user ,password);
		    preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1,fname);
			preparedStatement.setString(2,lname);
			preparedStatement.setString(3,dob);
			preparedStatement.setString(4,email);
			preparedStatement.setString(5,contact);
			preparedStatement.setString(6, city);
			preparedStatement.setString(7, gender);
			
		    result = preparedStatement.executeUpdate();
			
			if (result != 0) {			
				%>
			<h3><%= result %> row(s)affected</h3>
		<% 		
			} 	
       
		} catch (Exception e) {
			%>
			<%=e %>
	<%	}    %>
</body>
</html>