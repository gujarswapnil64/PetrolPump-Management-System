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
import services.fuelservice;

@WebServlet("/finalfuelupdate")
public class finalfuelupdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   
	   int fid=Integer.parseInt(request.getParameter("fid"));
	   String fname=request.getParameter("fname");
	   
	   fualtypemodel model=new fualtypemodel();
	   model.setId(fid);
	   model.setName(fname);
	   
	   fuelservice fs=new fualtypeserviceIMPL();
	   boolean b=fs.isupdatefueltype(model);
	   if(b)
	   {
		   RequestDispatcher o=request.getRequestDispatcher("viewfueltype.jsp");
			 o.include(request, response);
	   }
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
