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
employeeservice es=new employeeserviceIMPL();
  
%>
<%@ include file="adminpanalboard.jsp" %>
     
    <div class="col-sm-9 mt-5 ms-5">
    <br><br>
     <table class="table">
  <thead>
    <tr>
    <h2>Employee Info...</h2>
      <th scope="col">Sr.No</th>
      <th scope="col">Employee Name</th>
      <th scope="col"> Email</th>
      <th scope="col"> Contact</th>
      <th scope="col"> Allocate Machine</th>
      <th scope="col">Address</th>
      <th scope="col">Salary</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%
  
  int count=0;
  List<employeemodel> list =es.isgetallemployee();
  for(employeemodel  m :list)
  {
	  
	%>
	 <tr>
      <th scope="row"><%=m.getEid() %></th>
      <td><%=m.getName()%></td>
      <td><%=m.getEmail()%></td>
      <td><%=m.getContact()%></td>
      <td><a href="allocatemachineservlet?eid=<%=m.getEid()%>&ename=<%=m.getName() %>">Allocate Machine</a></td>
      <td><%=m.getAddress()%></td>
      <td><%=m.getSalary()%></td>
      <td><a href="empdeleteservlet?eid=<%=m.getEid() %>" class="ms-3 display-6"><ion-icon name="trash-outline"></ion-icon></a></td>
      <td><a href="empupdate?eid=<%=m.getEid()%>&name=<%=m.getName() %>&email=<%=m.getEmail() %>&contact=<%=m.getContact() %>&address=<%=m.getAddress() %>&salary=<%=m.getSalary() %>" class="ms-4 display-6"><ion-icon name="create-outline"></ion-icon></a></td>
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