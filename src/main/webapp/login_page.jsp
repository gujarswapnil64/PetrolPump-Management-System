<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="CSS/login.css" rel="stylesheet">
</head>
<body>
   <section>   
   
   <div class="custom-shape-divider-bottom-1710754379">
    <svg data-name="Layer 1" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1200 120" preserveAspectRatio="none">
        <path d="M1200,0H0V120H281.94C572.9,116.24,602.45,3.86,602.45,3.86h0S632,116.24,923,120h277Z" class="shape-fill"></path>
    </svg>
    </div>
     <form name='frm' action="login" method="post">
      <div class="conten">
        <div class="login">
            <label>Email</label><br>
            <input type="text"  name="email"  placeholder="gujarswapnil64@gmail.com"  required><br>

            <label>Password</label><br>
            <input type="password"  name="pass" placeholder="*********"  required>
            <%--autocomplete="off" --%>
            <input type="submit" name="s" value="Submit" >
        </div>
       <a href="addnewemployee.jsp"><h3><b>Register Here..</b></h3></a>
    </div> 
    </form>
    
 </section>
</body>
</html>