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
<%!
List<Object[]> list2;
int count=0,eid;
%>
<%

try{
     Object obj=session.getAttribute("eid");
    String e=String.valueOf(obj);
    eid=Integer.parseInt(e);
 
   //System.out.println("eid access...."+eid);
   employeeservice es=new employeeserviceIMPL();
   
     int mid=es.getmid(eid);
    // System.out.println("mid access...."+mid);
     
    list2=es.getsellingreport();
}
catch(Exception ex)
{
	   System.out.println("error is jsp page saleReport.jsp:>>>>>"+ex);
}
 
%>
  <%@ include file="employee_login_dashboard.jsp" %>
  
      <div class="modal-dialog modal-dialog-scrollable m-4  ">
         <table class="table table-success table-striped ">
         <thead>
         <tr>
      <h2>Selling Report....</h2>
      <th scope="col">Sr.No</th>
      <th scope="col"> Machine Code</th>
      <th scope="col">EMP-ID</th>
      <th scope="col"> Fuel Type</th>
      <th scope="col"> Quantity</th>
      <th scope="col">Price/Ltr</th>
      <th scope="col">Total</th>
      <th scope="col">Date</th>
   
    </tr>
  </thead>
  <tbody>     <%--  0        1     2      3       4        5        6      7 --%>
              <%--m.mname,e.name,e.eid,f.name,b.quantity,b.price,b.total,bdate --%>
       <%
    for(Object o[] : list2)
    {
    	    String e=String.valueOf(o[2]);
    	  Integer oid=Integer.parseInt(e);
    	   System.out.println("Accesseble Eid:>>"+oid);
    	if(oid==eid)
    	{   		
    	     %>
       <th scope="row"><%=++count %></th>
      <td><%=o[0]%></td> 
       <td><%=o[2]%></td>
      <td><%=o[3]%></td>
      <td><%=o[4]%></td>
      <td><%=o[5]%></td>
      <td><%=o[6]%></td>
      <td><%=o[7]%></td>
      </tr>
    <%     
       }
    }	
   %>
  </tbody>
         </table>
      </div>

<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>