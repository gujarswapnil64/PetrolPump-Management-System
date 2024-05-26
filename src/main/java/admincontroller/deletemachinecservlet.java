package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.machineservice;
import services.machineserviceIMPL;


@WebServlet("/del")
public class deletemachinecservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         int mid=Integer.parseInt(request.getParameter("mid"));
         machineservice ms=new machineserviceIMPL();
         boolean b=ms.ismachinedeletebyID(mid);
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
;;