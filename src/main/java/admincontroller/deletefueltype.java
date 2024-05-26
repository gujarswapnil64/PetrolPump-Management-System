package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.fualtypeserviceIMPL;
import services.fuelservice;


@WebServlet("/deletefueltype")
public class deletefueltype extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id=Integer.parseInt(request.getParameter("id"));
		fuelservice fs=new fualtypeserviceIMPL();
		boolean b=fs.isfueltypedeletebyID(id);
		if(b)
		{
			
			RequestDispatcher o=request.getRequestDispatcher("viewfueltype.jsp");
			o.include(request, response);
		}
		else {
			out.println("delete not");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
