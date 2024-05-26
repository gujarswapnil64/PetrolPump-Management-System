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


@WebServlet("/finalserv")
public class Finalservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		int machineid=Integer.parseInt(request.getParameter("mid"));
		String machinecode=request.getParameter("mcode");
		
		addmachine model=new addmachine();
		model.setId(machineid);
		model.setMachinecode(machinecode);
		
		machineservice ms=new machineserviceIMPL();
		boolean b=ms.isupdatemachine(model);
		 if(b)
		 {
			RequestDispatcher o=request.getRequestDispatcher("viewmachinr.jsp");
			 o.include(request, response);
			 
		 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
