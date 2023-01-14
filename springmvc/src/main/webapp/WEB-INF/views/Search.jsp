<%@page import="com.jspiders.springmvc.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp"/>
<%
StudentPOJO student = (StudentPOJO) request.getAttribute("student");
%>
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
<style type="text/css">
body {
	background-image:
		url('https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_960_720.jpg');
	background-size: 100%;
	
}
form {
	margin-top: 15px;
	padding: 2px;
}

form table {
	margin: auto;
	/* width: 100%; */
}

tr {
	text-align: center;
}

fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 35px 500px;
	text-align: center;
}

legend {
	color: Black;
	background-color: aqua;
}
.data{
            margin: 35px 500px;
            text-align: center;
            width: auto;
            /* margin: 0%; */
            margin-left: 370px;
   }  
</style>
</head>
<body>

	<fieldset>
		<legend>Search Student Details</legend>
		<form action="./search" method="post">
			<table>
				<tr>
					<td><label>Enter student id :</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	<%
	if (student != null) {
	%>
	<fieldset  class="data">
		<legend>Student Data</legend>
		<table border="1px solid ">
			<tr>
				<td>
					<h3>ID</h3>
				</td>
				<td>
					<h3>Name</h3>
				</td>
				<td>
					<h3>Email</h3>
				</td>
				<td>
					<h3>Contact</h3>
				</td>
				<td>
					<h3>City</h3>
				</td>
				<td>
					<h3>Username</h3>
				</td>
				<td>
					<h3>Password</h3>
				</td>
			</tr>
			<tr>
				<td><%=student.getId()%></td>
				<td><%=student.getName()%></td>
				<td><%=student.getEmail()%></td>
				<td><%=student.getContact()%></td>
				<td><%=student.getCity()%></td>
				<td><%=student.getUsername()%></td>
				<td><%=student.getPassword()%></td>
			</tr>
		</table>
	</fieldset>
	<%
	}
	%>
	<%
	if (msg != null) {
	%>
	<h3 align="center">
		<%=msg%>
	</h3>
	<%
	}
	%>
</body>
</html>