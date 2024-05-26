
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
      <form name="frm" action="newmachine" method="post">
        <label class="col-sm-4 mt-5 ms-2 mb-2"><b>Add Machine</b></label>
            <input type="text" class="form-control p-2" required name="machinecode" placeholder="Enter Machine Code here...">
            <br>
            <table>
            <%
               fuelservice fs=new fualtypeserviceIMPL();
                 List<fualtypemodel> list=fs.getallfueltype();
                 for(fualtypemodel m:list)
                 {
                  %>
                    <tr>
                    <td>
                    <input type="checkbox" name="ftype" required value='<%=m.getId()%>'><%=m.getName()%>
                    <td><input type="text" required name="capacity" value="" ></td>
                    </td>
                    </tr>
                  <%
                 }
            %>
            </table>
         <input type="submit"  value="Add Machine" class="btn btn-primary ms-1 mt-1" name="s">
      </form>
    </div> 
    </div>
    </div>
</body>
</html>