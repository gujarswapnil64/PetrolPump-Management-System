package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.fualtypemodel;
import services.fualtypeserviceIMPL;


@WebServlet("/fueltypeservlet")
public class fueltypeservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  String fueltype=request.getParameter("name");
	  fualtypemodel model=new fualtypemodel();
	  model.setName(fueltype);
	  fualtypeserviceIMPL fs=new fualtypeserviceIMPL();
	 boolean b= fs.isaddfuelmodel(model);
	    if(b)
	    {
	    	try {
	   			Thread.sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	RequestDispatcher r=request.getRequestDispatcher("viewfueltype.jsp");
	        r.include(request, response);
	    	
	    }
	    else
	    {
	    	RequestDispatcher r=request.getRequestDispatcher("fueltype.jsp");
	        r.include(request, response);
	    	
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
