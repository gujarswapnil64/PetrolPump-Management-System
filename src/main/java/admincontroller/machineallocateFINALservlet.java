package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import services.employeeservice;
import services.employeeserviceIMPL;

@WebServlet("/machineallocateFINAL")
public class machineallocateFINALservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    int eid=Integer.parseInt(request.getParameter("eid"));
	    int mid=Integer.parseInt(request.getParameter("mid"));
	    String starttime=request.getParameter("starttime");
	    String endtime=request.getParameter("endtime");
	    String date=request.getParameter("allocatedate");
	   employeeservice es=new  employeeserviceIMPL();
	   
	 boolean b=es.alloacatemachine(eid, mid,starttime,endtime,date);
	    if(b)
	    {
	    	 RequestDispatcher o=request.getRequestDispatcher("viewallemployee.jsp");
			 o.include(request, response);
	    }
	    else
	    {
	    	out.print("record not saved");
	    }
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
