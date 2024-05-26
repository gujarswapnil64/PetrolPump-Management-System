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
  <%@ include file="adminpanalboard.jsp" %>
<%!
int total,today;
employeeservice es=new employeeserviceIMPL();
%>
<%
    total=es.gettotal(); 
    today=es.todaygettotal();
%>
<div class="card shadow-lg p-3 mb-5 bg-danger rounded " style="max-width: 540px;height:250px; margin:100px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="CSS/petrol.jpg" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8 shadow-lg  bg-body rounded">
      <div class="card-body">
        <h5 class="card-title">Total Selling..</h5>
        <h3 class="card-text"><%=total %></h3>
      </div>
    </div>
    
    <div class="row g-0 mt-2">
    <div class="col-md-4">
      <img src="CSS/petrol.jpg" class="img-fluid rounded-start" alt="...">
    </div>
    <div class="col-md-8 shadow-lg  bg-body rounded">
      <div class="card-body">
        <h5 class="card-title">Today Selling..</h5>
        <h3 class="card-text"><%=today %></h3>
      </div>
    </div>
  </div>
</div>
</body>
</html>