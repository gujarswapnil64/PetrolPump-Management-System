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

@WebServlet("/fpriceupdate")
public class fuelpriceupdate extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String ftype=request.getParameter("ftype");
	int price=Integer.parseInt(request.getParameter("price"));
	
	RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
	o.include(request, response);

	out.println("<div class='col-sm-2 m-5'>");
	out.println("<form name='frm' action='' method='post'>");
	out.println("<input type='text' name='newprice' class='form-control border border-warning border-4' value='"+price+"'><br>");
	out.println("<input type='submit' name='s' class='form-control bg-warning border-4 rounded-pill' value='UPDATE MACHINE CODE...'><br><br><br>");
	out.println("</form>");
	out.println("</div></div></div>");
	
	String btn=request.getParameter("s");
	if(btn!=null)
	{
		int newprice=Integer.parseInt(request.getParameter("newprice"));
		fuelservice fs=new fualtypeserviceIMPL();
		boolean b=fs.isaddfuelpriceupdate(newprice, price);
		if(b)
		{
			 o=request.getRequestDispatcher("viewfueltype.jsp");
			o.include(request, response);
		}
		else
		{
			out.print("<h1>Fuel Price Not Update</h1>");
		}
	}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
