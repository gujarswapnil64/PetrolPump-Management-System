<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="services.*,java.util.*,java.sql.*,admin.model.*,config.DBConfig.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
protected Connection conn;
protected PreparedStatement stmt;
protected ResultSet rs;
%>
<%
  String str=request.getParameter("p");
 
try{
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/petrolpump","root","ROOT");
     
	  if(conn!=null)
	  {
		  stmt=conn.prepareStatement("select m.mname,e.name,e.eid,f.name,b.quantity,b.price,b.total,b.bdate from machineinfo m inner join billing b on m.mid=b.mid inner join fueltype f on b.id=f.id inner join employee e on e.eid=b.eid where e.name like '%"+str+"%'");
		   rs=stmt.executeQuery();
		   %>
		   
		   <table class="table ">
  <thead>
    <tr>
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
		   while(rs.next())
		   {
				%><tr>
				   <td><%=rs.getString(1)%></td> 
                   <td><%=rs.getString(2)%></td>
                   <td><%=rs.getString(4)%></td>
                   <td><%=rs.getInt(5)%></td>
                   <td><%=rs.getInt(6)%></td>
                   <td><%=rs.getInt(7)%></td>
                   <td><%=rs.getString(8)%></td>
                   </tr>
				<%
		   }
		   out.println("</table>");
	  }
	  else
	  {
		  out.println("Databace not connected for fetch.jsp page:>>>");
	  }
   
}
catch(Exception ex)
{
	System.out.println("Error is fetch.jsp:>>>"+ex);
}

%>
</body>
</html>