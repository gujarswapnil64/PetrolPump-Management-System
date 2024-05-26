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
  
%>
<%@ include file="adminpanalboard.jsp" %>
     
    <div class="col-sm-9 mt-5 ms-5">
    <br><br>
     <table class="table">
  <thead>
     <a class="btn btn-primary btn-lg mb-3"  href="fuelprice.jsp" role="button" style="float:right">Rates..</a>
    <tr>
    <h2>Fuel Info...</h2>
      <th scope="col">Sr.No</th>
      <th scope="col">Fuel type</th>
      <th scope="col"> Add Fuel Rate</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%
  
  int count=0;
  List<fualtypemodel> list =ms.getallfueltype();
  for(fualtypemodel  m :list)
  {
	  
	%>
	 <tr>
      <th scope="row"><%=++count %></th>
      <td><%=m.getName()%></td>
      <td><a href="fuelprice?id=<%=m.getId() %>&fname=<%=m.getName() %>" class="ms-3 h3 fw-light text-decoration-none">Rate</a></td>
      <td><a href="deletefueltype?id=<%=m.getId() %>" class="ms-3 display-6"><ion-icon name="trash-outline"></ion-icon></a></td>
      <td><a href="updfueltype?id=<%=m.getId()%>&name=<%=m.getName() %>" class="ms-4 display-6"><ion-icon name="create-outline"></ion-icon></a></td>
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