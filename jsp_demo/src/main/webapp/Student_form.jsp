<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
   <form action="./Student_Info.jsp" method="get">
      <table>
        <tr>
           <td><label> FName</label></td>
           <td><input type="text" name="fname"></td>
        </tr>
        <tr>
           <td><label> LName</label></td>
           <td><input type="text" name="lname"></td>
        </tr>
        <tr>
           <td><label> DOB</label></td>
           <td><input type="text" name="dob"></td>
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
</body>
</html>