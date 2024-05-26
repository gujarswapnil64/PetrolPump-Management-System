<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="services.*,java.util.*,admin.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function fetchData(){
    var str=document.getElementById("s").value;
      
    var xhttp=new XMLHttpRequest();
    xhttp.onreadystatechange=function(){
    	
        if(this.readyState==4 && this.status==200){
            document.getElementById("d").innerHTML=this.responseText;
            
        }
    };
    xhttp.open("GET","fetch.jsp?p="+str,true);
    xhttp.send();
    
  }
  
  
function fetchDatadate(){
    var str=document.getElementById("dat").value;
      
    var xxhttp=new XMLHttpRequest();
    xxhttp.onreadystatechange=function(){
    	
        if(this.readyState==4 && this.status==200){
            document.getElementById("d").innerHTML=this.responseText;
           
        }
    };
    xxhttp.open("GET","fetchDatafordate.jsp?d="+str,true);
    xxhttp.send();
    
  }
</script>
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
    <lable class="badge bg-warning text-dark">Searching</lable>
    <input type='text' name='name'  style='width:300px;height:40px;'
               id="s" onkeyup="fetchData()" placeholder="Ex. S, Swa, Swapnil"/>
             
              
              <lable class="badge bg-warning text-dark">Date Voice</lable> 
               <input type='date' name='sdate' style='width:300px;height:40px;'
               id="dat" onchange="fetchDatadate()" />
              
               <div id="d"></div>
               <div id="v"></div>
    
    </div> 
    </div>
    </div>
    <script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
    
</body>
</html>