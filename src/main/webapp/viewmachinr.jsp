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
machineservice ms=new machineserviceIMPL();
  
%>
<%@ include file="adminpanalboard.jsp" %>
     
    <div class="col-sm-9 mt-5 ms-5 ">
    <br><br>
     <table class="table ">
  <thead>
    <tr>
    <h2>Machine Info...</h2>
      <th scope="col">Sr.No</th>
      <th scope="col">Machine Code</th>
      <th scope="col">Fuel type</th>
      <th scope="col">Capacity</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%
  
  int count=0;
  List<Object []> list =ms.getallmachine();
  for(Object  m[] :list)
  {
	  
	%>
	 <tr>
	 <!--  Index      0       1          2          3   -->
	 <!--  Index   m.mname f.name   mtj.capacity  m.mid   -->
    
      <th scope="row"><%=++count %></th>
      <td><%=m[0]%></td>
      <td><%=m[1]%></td>
      <td><%=m[2]%></td>
      <td><a href="del?mid=<%=(int)m[3] %>" class="ms-3 display-6"><ion-icon name="trash-outline"></ion-icon></a></td>
      <td><a href="updmachine?mid=<%=(int)m[3]%>&mcode=<%=m[0].toString() %>" class="ms-4 display-6"><ion-icon name="create-outline"></ion-icon></a></td>
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