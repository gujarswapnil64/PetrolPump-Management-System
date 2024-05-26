package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.addmachine;
import services.machineservice;
import services.machineserviceIMPL;

@WebServlet("/allocatemachineservlet")
public class allocatemachineservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
	o.include(request, response);
	machineservice ms=new machineserviceIMPL();
	List<addmachine> list1=ms.getallmachineusing_addmachine_model();
	
	int eid=Integer.parseInt(request.getParameter("eid"));
	String ename=request.getParameter("ename");
	
//	out.println("<h2>Hey "+ename+" we are going to allocate machine...</h2>");
	out.println("<div class='col-sm-3 m-5'>");
	out.println("<form name='frm' action='machineallocateFINAL' method='post'>");
	out.println("<input type='hidden' name='eid' class='form-control border border-warning border-4' value='"+eid+"'><br>");
	out.println("<select name='mid' class='form-control border border-warning border-4 p-2 m-1' value='' ><br>");
	out.println("<option>Select Machine</option>");
	for(addmachine m:list1)
	{
		out.println("<option value='"+m.getId()+"'>");
		out.println(m.getMachinecode());
		out.println("</option>");
	}
	out.println("</select>");
	out.println("<input type='time' required name='starttime' class='form-control border border-warning border-4' value=''><br>");
	out.println("<input type='time' required name='endtime' class='form-control border border-warning border-4' value=''><br>");
	out.println("<input type='date' required name='allocatedate' class='form-control border border-warning border-4' value=''><br>");
	out.println("<input type='submit' name='s' class='form-control bg-warning border-4 rounded-pill' value='Allocate Machine To The Employee...'><br><br><br>");
	out.println("</form>");
	out.println("</div></div></div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
