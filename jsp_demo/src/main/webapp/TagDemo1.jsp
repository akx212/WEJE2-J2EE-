<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Demo</title>
</head>
<body>
  <h1>This is a Tag Demo 1 JSP file</h1>
     <%! int a=10; %>
     <%! int b=20; %>
     <%! int c=0; %>
     <% c=a+b; %>
    <h1><%= c %></h1>
</body>
</html>