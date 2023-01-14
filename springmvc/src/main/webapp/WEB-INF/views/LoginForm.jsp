<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Management</title>
</head>
<style>
  body {
            background-image: url('https://cdn.pixabay.com/photo/2016/05/05/02/37/sunset-1373171_960_720.jpg');
            background-size: 100%;
        }
        
        table {
            margin: 0 auto;
        }
        
        form {
            margin-top: 50px;
            position: relative;
            padding: 40px;
            
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
            margin: 100px 450px;
            text-align: center;
        }
        
        legend {
            color: Black;
            background-color: aqua;
        }
        
        input {
            padding: 6px;
            margin: 5px;
        }
        
        label {
            /* padding: 6px; */
            margin: 0 auto;
            width: 100%;
        }
</style>
<body>

	<fieldset>
		<%
		if (msg != null) {
		%>
		<%=msg%>
		<%
		}
		%>
		<legend>Login Form</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td><label>Username :</label></td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td><label>Password :</label></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>

</body>
</html>