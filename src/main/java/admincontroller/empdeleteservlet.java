package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.employeeservice;
import services.employeeserviceIMPL;


@WebServlet("/empdeleteservlet")
public class empdeleteservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int eid=Integer.parseInt(request.getParameter("eid"));
		employeeservice es=new employeeserviceIMPL();
	     boolean b=es.isdeleteemployeebyID(eid);
	     if(b)
	     {
	    	 RequestDispatcher o=request.getRequestDispatcher("viewallemployee.jsp");
			 o.include(request, response);
			}
	     else
	     {
	    	 out.print(" employee not delete");
	     }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
