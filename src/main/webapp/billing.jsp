<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="services.*,java.util.*,admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="JS/all.js"> </script>
</head>
<body>
<%
machineservice ms=new machineserviceIMPL();
fuelservice fs=new fualtypeserviceIMPL();
 int fidd;
List<addmachine> list =ms.getallmachineusing_addmachine_model();
List<fualtypemodel> list1 =fs.getallfueltype();
%>
 <%@ include file="employee_login_dashboard.jsp" %>
     
    <div class="col-sm-9 mt-5 ms-5">
         <a class="btn btn-primary btn-lg mb-3"  href="fuelprice1.jsp" role="button" style="float:right">Rates..</a>
    
    <form class="row g-3" name='frm' action='bill' method="post">
 <%-- 
  <div class="col-md-8">
    <label class="form-label">Select Machine</label>
   <select name="mid" class="form-select">
      <option selected>Choose...</option>
      <%
   for(addmachine m:list)
   {
  %>
      <option><%=m.getMachinecode() %></option>
       <%
   }
    %>
    </select>
    
  </div><br>
   --%>
    
    <div class="col-md-4">
    <label class="form-label">Machine</label>
     <input type="hidden" class="form-control"  name="mid" value="<%=session.getAttribute("mid") %>">
    <input type="text" class="form-control" readonly  value="<%=String.valueOf(session.getAttribute("mname"))%>" >
    </div>
    <div class="col-md-4">
    <label class="form-label">Employee ID</label>
     <input type="hidden" class="form-control"  name="eid" value="<%=session.getAttribute("eid") %>">
    <input type="text" class="form-control" readonly  value="<%=String.valueOf(session.getAttribute("eid"))%>" >
    </div>
  <div class="col-md-8">
    <label class="form-label">Select Fuel Type</label>
    <select name="fid" class="form-select" required value="">
      <option selected>Choose...</option>
      <%
   for(fualtypemodel o:list1)
   {
	   %>
      <option value=<%=o.getId() %>><%=o.getName() %></option>
       
       <%
   }
    %>
    </select>
  </div>
  <div class="col-md-8">
    <label class="form-label">Date</label>
    <input type="date" class="form-control" name="bdate"  >
    </div>
   <br>
  <div class="col-md-5">
    <label class="form-label">Quantity</label>
    <input type="text" required class="form-control" name="qua" id="q1">
  </div>
  
  <div class="col-md-3">
    <label  class="form-label">Price</label>
    <input type="text" required class="form-control" name="price" id="q2" onkeyup="add()">
  </div>
 
 <div class="col-md-8">
    <label  class="form-label">Total</label>
    <input type="text" required class="form-control" name="total" id="show">
  </div>
  <div class="col-12">
    <input type="submit" class="btn btn-primary" value="Submit" name="s">
  </div>
</form>
    </div> 
    </div>
    </div>
    
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>