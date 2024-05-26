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
import admin.model.fualtypemodel;
import services.employeeservice;
import services.employeeserviceIMPL;
import services.fualtypeserviceIMPL;
import services.fuelservice;


@WebServlet("/finalempupdate")
public class finalempupdate extends HttpServlet {
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   response.setContentType("text/html");
		   PrintWriter out=response.getWriter();
		   
		   int eid=Integer.parseInt(request.getParameter("eid"));
		   String name=request.getParameter("name");
		   String email=request.getParameter("email");
		   String contact=request.getParameter("contact");
		   String address=request.getParameter("address");
		   int salary=Integer.parseInt(request.getParameter("salary"));
		   
			  
		   employeemodel model=new employeemodel();
		   model.setEid(eid);
		   model.setName(name);
		   model.setEmail(email);
		   model.setContact(contact);
		   model.setAddress(address);
		   model.setSalary(salary);
		   
		   employeeservice fs=new employeeserviceIMPL();
		   boolean b=fs.isupdateemployee(model);
		   if(b)
		   {
     		   RequestDispatcher o=request.getRequestDispatcher("viewallemployee.jsp");
			   o.include(request, response);
			  
		   }
		   else
		   {
			   
			   out.print("not update");
		   }
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
