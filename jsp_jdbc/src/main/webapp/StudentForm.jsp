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
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Student Registration </title>
</head>
<body>
  <fieldset>
    <legend>Student Details</legend>
    <form action="./StudentInfo.jsp" method="get">
      <table>
        <tr>
           <td><label> First Name</label></td>
           <td><input type="text" name="fname"></td>
        </tr>
        <tr>
           <td><label> Last Name</label></td>
           <td><input type="text" name="lname"></td>
        </tr>
        <tr>
           <td><label> DOB</label></td>
           <td><input type="datetime-local" name="dob"></td>
        </tr>
        <tr>
           <td><label> Email</label></td>
           <td><input type="text" name="email"></td>
        </tr>
        <tr>
           <td><label> Contact </label></td>
           <td><input type="text" name="contact"></td>
        </tr>
        <tr>
           <td><label> City</label></td>
           <td><input type="text" name="city"></td>
        </tr>
        <tr>
           <td><label> Gender</label></td>
           <td><input type="text" name="gender"></td>
        </tr>
         <tr>
           <td><input type="Submit" name="Submit" value="SUBMIT"></td>
        </tr>
      </table>  
   </form>
  </fieldset>
</body>
</html>