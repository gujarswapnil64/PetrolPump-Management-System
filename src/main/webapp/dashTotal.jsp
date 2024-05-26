<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@page import="admin.model.*,services.*,login_control.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>
  <%@ include file="employee_login_dashboard.jsp" %>
<%!
int total;
employeeservice es=new employeeserviceIMPL();
%>
<%
    Object obj=session.getAttribute("eid");
  String str=String.valueOf(obj);
  int eid=Integer.parseInt(str);
  total=es.todaygettotalbyEMPID(eid); 
    
%>
<div class="card text-white bg-secondary mb-3 mt-5" style='max-width: 28rem; margin-left:200px;'>
  <div class="card-header">Today-Overview</div>
  <div class="card-body" >
    <h5 class="card-title">Employee Name: <b class="text-warning"><%=session.getAttribute("name") %></b> </h5>
  </div>
   <h3 class="card-text ms-3">Total-Sell : <%=total %> </h3>
</div>
</body>
</html>