<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>
<%
   
System.out.println("session on welcome page.."+session.getAttribute("eid"));
%>
<a href="logout?eid=<%=session.getAttribute("eid") %>">logout</a>

</body>
</html>