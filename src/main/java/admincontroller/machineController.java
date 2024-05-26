package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.addmachine;
import services.machineservice;
import services.machineserviceIMPL;

import admincontroller.machineController;
@WebServlet("/newmachine")
public class machineController extends HttpServlet {
	
	machineservice  MS=new machineserviceIMPL();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    String machinecode=request.getParameter("machinecode");
	    String []ftypeArr=request.getParameterValues("ftype");
	    String []capacityArr=request.getParameterValues("capacity");
	    addmachine model=new addmachine();
	    model.setMachinecode(machinecode);
	    
	    		boolean b= MS.isaddmachine(model,ftypeArr,capacityArr);	
	    if(b)
	    {


	    	RequestDispatcher r=request.getRequestDispatcher("viewmachinr.jsp");
	        r.include(request, response);
//	    	out.println("machine added successfully...");
	    }
	  else
	  {
		  RequestDispatcher r=request.getRequestDispatcher("adminpanalboard.jsp");
          r.include(request, response);
		  out.print("not Added");
	  }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
