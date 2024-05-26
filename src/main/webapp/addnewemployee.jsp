
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="admin.model.* ,services.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="adminpanalboard.jsp" %>
     
    <div class="col-sm-3 mt-3 "><br>
      <form name="frm" action="addemp" method="post">
        <label class="col-sm-8 mt-5 ms-2 mb-2"><b><h2>New Employee</h2></b></label>
         <label class="col-sm-8 ms-2 mb-2"><b>Employee name</b></label>
            <input type="text" required class="form-control p-2 m-1" name="ename" placeholder="Ex. Swapnil Gujar">
          
          <label class="col-sm-8 ms-2 mb-2"><b>Employee Email</b></label>
            <input type="email" required class="form-control p-2 m-1" name="eemail" placeholder="Ex. gujarswapnil64@gmail.com">
            
            <label class="col-sm-8 ms-2 mb-2"><b>Employee Contact</b></label>
            <input type="contact" required class="form-control p-2 m-1" name="econtact" placeholder="Ex. 7262954525 ">
           
           <label class="col-sm-8 ms-2 mb-2"><b>Employee Address</b></label>
            <input type="text" required class="form-control p-2  m-1" name="eaddress" placeholder="Ex. Dhule ">
            
            <label class="col-sm-8 ms-2 mb-2"><b>Employee Salary</b></label>
            <input type="text" required class="form-control p-2 m-1" name="esalary" placeholder=" Ex. 20000 ">
            
         <input type="submit"  value="Add Employee" class="btn btn-primary ms-1 mt-1" name="s">
      </form>
    </div> 
    </div>
    </div>
</body>
</html>