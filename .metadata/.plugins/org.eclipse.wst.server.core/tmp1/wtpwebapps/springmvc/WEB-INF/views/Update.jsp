<%@page import="java.util.List"%>
<%@page import="com.jspiders.springmvc.pojo.StudentPOJO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="NavBar.jsp" />
<%
List<StudentPOJO> students = (List<StudentPOJO>) request.getAttribute("students");
String msg = (String) request.getAttribute("msg");
StudentPOJO student = (StudentPOJO) request.getAttribute("student");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
<style type="text/css">
body {
	background-image: url('https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_960_720.jpg');
	background-size: 100%;
}

form {
	margin-top: 10px;
}

form table {
	margin: auto;
	width: 100%;
}

tr {
	text-align: center;
}

fieldset table {
	margin: auto;
	text-align: left;
}

fieldset {
	margin: 15px 520px;
	text-align: center;
}

legend {
	color: Black;
	background-color: aqua;
}

#data{
        width: auto;
        margin: 0%;
        margin: 15px 400px;
        text-align: center;
    }
</style>
</head>
<body>

	<%
	if (student != null) {
	%>
	<fieldset>
		<legend>Update Student Details</legend>
		<form action="./updateData" method="post">
			<table>
				<tr hidden="true">
					<td><input type="text" name="id" value="<%=student.getId()%>">
					</td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"
						value="<%=student.getName()%>"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="text" name="email"
						value="<%=student.getEmail()%>"></td>
				</tr>
				<tr>
					<td>Contact</td>
					<td><input type="text" name="contact"
						value="<%=student.getContact()%>"></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="city"
						value="<%=student.getCity()%>"></td>
				</tr>
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"
						value="<%=student.getUsername()%>"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="text" name="password"
						value="<%=student.getPassword()%>"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
	} else {
	%>

	<fieldset>
		<legend>Update Student</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td><label>Enter Student id :</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>

	<%
	if (msg != null) {
	%>
	<h3 align="center"><%=msg%></h3>
	<%
	}
	%>
	<%
	if (students != null) {
	%>
	<fieldset id="data">
		<legend>Student Details</legend>
		<table border="1px solid">
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
			<%
			for (StudentPOJO stud : students) {
			%>
			<tr>
				<td><%=stud.getId()%></td>
				<td><%=stud.getName()%></td>
				<td><%=stud.getEmail()%></td>
				<td><%=stud.getContact()%></td>
				<td><%=stud.getCity()%></td>
				<td><%=stud.getUsername()%></td>
				<td><%=stud.getPassword()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</fieldset>
	<%
	}
	%>
	<%
	}
	%>

</body>
</html>