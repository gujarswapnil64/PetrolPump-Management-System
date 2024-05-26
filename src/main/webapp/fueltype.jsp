
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="adminpanalboard.jsp" %>
     
    <div class="col-sm-3 mt-3 "><br>
      <form name="frm" action="fueltypeservlet" method="post">
        <label class="col-sm-4 mt-5 ms-2 mb-2 text-black"><b>Add Fuel type</b></label>
            <input type="text" class="form-control p-2 " required name="name" placeholder="Enter Fuel type here..." >
         
         <input type="submit"  value="Add Fuel type" class="btn btn-primary ms-1 mt-1 " name="s">
      </form>
    </div> 
    </div>
    </div>
</body>
</html>