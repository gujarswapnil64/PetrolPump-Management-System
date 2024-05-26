<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="admin.model.*,services.*,login_control.*" %>
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
int count=0;
%>
<%
//int e=(int) session.getAttribute("eid");
//System.out.println(e);
//    int eid=Integer.parseInt(e);  String. valueOf(object)
   try{
        Object obj=session.getAttribute("eid");
       String e=String.valueOf(obj);
      int eid=Integer.parseInt(e);
     
      // System.out.println("success thai gai contact nu:>>>/.."+String.valueOf(session.getAttribute("contact")));
       employeeservice es=new employeeserviceIMPL();
       m=es.getprofile(eid); 
   }
   catch(Exception ex)
{
	   System.out.println("error is viewprofile.jsp:>>>>>"+ex);
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
      <th scope="col"> Email</th>
      <th scope="col"> Contact</th>
      <th scope="col">Address</th>
      <th scope="col">Salary</th>
   
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"><%=++count %></th>
      <td><%=m.getEid() %></td>
      <td><%=String.valueOf(session.getAttribute("name"))%></td>
      <td><%=String.valueOf(session.getAttribute("email"))%></td>
      <td><%=String.valueOf(session.getAttribute("contact"))%></td>
      <td><%=String.valueOf(session.getAttribute("address"))%></td>
      <td><%=m.getSalary()%></td>
       </tr>
  </tbody>
         </table>
      </div>

<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>