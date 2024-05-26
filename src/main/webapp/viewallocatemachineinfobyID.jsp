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
employeemodel m;
int count=0,eid;
boolean flag=false;
List<Object []> list1;
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
     
    list1=es.viewallocatemachineinfobyID(eid, mid);
}
catch(Exception ex)
{
	   System.out.println("error is jsp page viewallocatemachineinfobyID.jsp:>>>>>"+ex);
}
 
%>
  <%@ include file="employee_login_dashboard.jsp" %>
  
      <div class="modal-dialog modal-dialog-scrollable m-4  ">
         <table class="table table-success table-striped ">
         <thead>
         <tr>
      <h2>Employee Info...</h2>
      <th scope="col">Sr.No</th>
      <th scope="col"> EID</th>
      <th scope="col">Employee Name</th>
      <th scope="col"> Machine Name</th>
      <th scope="col"> Start Time</th>
      <th scope="col">End Time</th>
      <th scope="col">Date</th>
      <th scope="col">Machine ID</th>
    </tr>
  </thead>
  <tbody>
    <tr>
    <%--  0        1       2        3        4     5       6 --%>
    <%--m.mname,e.name,em.stime,em.etime,em.date,em.mid,em.eid --%>
     <%
    for(Object o[] : list1)
    {
    	    String e=String.valueOf(o[6]);
    	  Integer oid=Integer.parseInt(e);
    	   
    	if(oid==eid )
    	{
    		session.setAttribute("mname", o[0]);
    		session.setAttribute("mid", o[5]);
    		
    		flag=true;
    	     %>
       <th scope="row"><%=++count %></th>
      <td><%=o[6]%></td>
      <td><%=o[1]%></td>
      <td><%=o[0]%></td>
      <td><%=o[2]%></td>
      <td><%=o[3]%></td>
      <td><%=o[4]%></td>
      <td><%=o[5]%></td>
    
       <%--
       <td><a href="#" class="ms-3 display-6"><ion-icon name="trash-outline"></ion-icon></a></td>
      <td><a href="#" class="ms-3 display-6"><ion-icon name="create-outline"></ion-icon></a></td>
  
       eid=<%=m.getEid()%>&name=<%=m.getName() %>&email=<%=m.getEmail() %>&contact=<%=m.getContact() %>&address=<%=m.getAddress() %>&salary=<%=m.getSalary() %> --%>
    </tr>
    <%    
       }
    }	
     if(!flag)
     {
    	 %>
    	      <a href="viewallemployee.jsp" style="color:white;font-size:40px;text-decoration:none;"> Machine Not Allocate for Employee</a>
    	     <br> <span style="color:red;font-size:20px; margin-left:210px;">Request for Admin</span>
    	 <%
     }
    	%>
   
    
  </tbody>
         </table>
      </div>

<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>