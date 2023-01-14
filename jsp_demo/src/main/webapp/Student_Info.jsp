<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% String fname=request.getParameter("fname"); %>
    <% String lname=request.getParameter("lname"); %>
    <% String dob=request.getParameter("dob"); %>
    <% String email=request.getParameter("email"); %>
    <% String contact=request.getParameter("contact"); %>
    <% String city=request.getParameter("city"); %>
    <% String gender=request.getParameter("gender"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Info</title>
</head>
<body>

      <table>
        <tr>
           <td><label> FName</label></td>
           <td><%=fname%></td>
        </tr>
        <tr>
           <td><label> LName</label></td>
           <td><%=lname%></td>
        </tr>
        <tr>
           <td><label> DOB</label></td>
           <td><%=dob%></td>
        </tr>
        <tr>
           <td><label> Email</label></td>
           <td><%=email%></td>
        </tr>
        <tr>
           <td><label> Contact </label></td>
           <td><%=contact%></td>
        </tr>
        <tr>
           <td><label> City</label></td>
           <td><%=city%></td>
        </tr>
        <tr>
           <td><label> Gender</label></td>
           <td><%=gender%></td>
        </tr>
         <tr>
           <td><input type="Submit" name="Submit" value="SUBMIT"></td>
        </tr>
      </table>  
  
</body>
</html>