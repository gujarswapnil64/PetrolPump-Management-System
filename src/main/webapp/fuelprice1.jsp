<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="services.*,java.util.*,admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
fuelservice ms=new fualtypeserviceIMPL();
List<Object[]> list;
%>
<%@ include file="employee_login_dashboard.jsp" %>
    
    <div class="col-sm-9 mt-5 ms-5">
    <br><br>
     <table class="table">
  <thead>
    <tr>
    <h2>Fuel Price Info...</h2>
      <th scope="col">Sr.No</th>
      <th scope="col">Fuel type</th>
      <th scope="col">Rate</th>
     
    </tr>
  </thead>
  <tbody>
  <%
  
  int count=0;
   list =ms.isgetfuelprice();
  for(Object  o[] :list)
  {
	  
	%>
	 <tr>
      <th scope="row"><%=++count %></th>
      <td><%=o[0]%></td>
      <td><%=o[1]%></td>
      
       </tr>
	<%
	  
 
  }
  %>
   
  </tbody>
</table>
    </div> 
    </div>
    </div>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>