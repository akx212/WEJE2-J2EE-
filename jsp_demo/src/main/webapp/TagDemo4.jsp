<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="TagDemo1.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Demo</title>
</head>
<body>
  <h1>This is a Tag Demo 2 JSP</h1>
  
  <%! List<Integer> list = new ArrayList(); %>
  <% list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5); %>
     
   <% for(int num:list){ %>  
   <%= num %>
   <% } %>
</body>
</html>