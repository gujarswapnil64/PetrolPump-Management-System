package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.employeemodel;
import services.employeeservice;
import services.employeeserviceIMPL;

@WebServlet(name = "addemployeeservlet", urlPatterns = { "/addemp" })
public class addemployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String ename=request.getParameter("ename");
	String eemail=request.getParameter("eemail");
	String econtact=request.getParameter("econtact");
	String eaddress=request.getParameter("eaddress");
	int sal=Integer.parseInt(request.getParameter("esalary"));
	
	employeemodel model=new employeemodel();
	model.setName(ename);
	model.setEmail(eemail);
	model.setContact(econtact);
	model.setAddress(eaddress);
	model.setSalary(sal);
	
	employeeservice es=new employeeserviceIMPL();
	boolean b=es.isaddnewemp(model);
	if(b)
	{
		RequestDispatcher o=request.getRequestDispatcher("viewallemployee.jsp");
		o.include(request, response);
	}
	else
	{
		out.print(" employee not added");
	}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
