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
List<Object[]>  list=es.getsellingreport();
int count=0,eid;
  
%>
 <%@ include file="adminpanalboard.jsp" %>
     
    <div class="col-sm-9 mt-5 ms-5">
    <br><br>
     <table class="table overflow-scroll">
  <thead>
    <tr>
      <h2>Selling Report....</h2>
      <th scope="col">Sr.No</th>
      <th scope="col"> Machine Code</th>
      <th scope="col">Employee-Name</th>
      <th scope="col"> Fuel Type</th>
      <th scope="col"> Quantity</th>
      <th scope="col">Price/Lr</th>
      <th scope="col">Total</th>
      <th scope="col">Date</th>
   
    </tr>
  </thead>
  <tbody>
  <%
    for(Object o[] : list)
    {
    	     %>
       <th scope="row"><%=++count %></th>
      <td><%=o[0]%></td> 
       <td><%=o[1]%></td>
      <td><%=o[3]%></td>
      <td><%=o[4]%></td>
      <td><%=o[5]%></td>
      <td><%=o[6]%></td>
       <td><%=o[7]%></td>
      </tr>
    <%} %>
  </tbody>
</table>
    </div> 
    </div>
    </div>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>