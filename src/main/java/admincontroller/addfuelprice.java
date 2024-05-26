package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.fualtypemodel;
import services.fualtypeserviceIMPL;
import services.fuelservice;

@WebServlet("/fuelprice")
public class addfuelprice extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
		o.include(request, response);
		
		int id=Integer.parseInt(request.getParameter("id"));
		String fname=request.getParameter("fname");
		System.out.println("fid:>>"+id);
		System.out.println("Fname"+fname);
		
		fuelservice fs=new fualtypeserviceIMPL();
		List<fualtypemodel> list=fs.getallfueltype();
		out.println("<div class='col-sm-3 m-5'>");
		out.println("<form name='frm' action='' method='post'>");
		out.println("<input type='hidden' name='fid' class='form-control border border-warning border-4' value='"+id+"'><br>");
		out.println("<input type='text' name='fname' class='form-control border border-warning border-4' value='"+fname+"' readonly ><br>");
		out.println("<input type='text' required name='fprice' placeholder='enter the rate of following Fuel' class='form-control border border-warning border-4' value=''><br>");
		out.println("<input type='submit' required name='s' class='form-control border border-warning border-4' value='Submit'><br>");
		out.println("</form>");
		out.println("</div></div></div>");
		
		String btn=request.getParameter("s");
		if(btn!=null)
		{
			System.out.println("oclick start");
		int price=Integer.parseInt(request.getParameter("fprice"));
		boolean b=fs.isaddfuelprice(id,price);
		if(b)
		{
			out.print("success fuel price added");
		}
		else
		{
			out.print("<h1>Not</h1>success fuel price added");
		}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
