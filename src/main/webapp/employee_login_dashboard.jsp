<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="services.*,admin.model.*,login_control.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 <link href=CSS/adminstyle.css rel="stylesheet">
     <script src="https://kit.fontawesome.com/cb39b22979.js" crossorigin="anonymous"></script>
 
</head>
<body class="colorback">

       <nav class="navbar navbar-expand-lg navbar-light bg-light m-2 sticky-top">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><%= String.valueOf(session.getAttribute("email"))%></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
      <li class="nav-item active">
          <a class="nav-link active" href="dashTotal.jsp" aria-current="true">Dashboard</a>
        </li>
        <li class="nav-item">
          <a href="viewprofile.jsp" class="nav-link active" aria-current="page" >View Profile</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="viewallocatemachineinfobyID.jsp">View Allocated Machine</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="billing.jsp">Billing</a>
        </li>
         <li class="nav-item">
          <a class="nav-link" href="saleReport.jsp">Sale Reports..</a>
        </li>
        <li class="nav-item">
          <a href="logout?eid=<%=session.getAttribute("eid") %>" class="nav-link"><i class="fa-solid fa-arrow-right-from-bracket"></i>LogOut</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
  
</body>
</html>