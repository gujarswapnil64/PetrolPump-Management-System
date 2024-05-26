package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.billingmodel;
import services.employeeservice;
import services.employeeserviceIMPL;


@WebServlet("/bill")
public class billing extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 response.setContentType("text/html");
	 PrintWriter out=response.getWriter();
	  int mid=Integer.parseInt(request.getParameter("mid"));
	  int fid=Integer.parseInt(request.getParameter("fid"));
	  int eid=Integer.parseInt(request.getParameter("eid"));
	  int qua=Integer.parseInt(request.getParameter("qua"));
	  int price=Integer.parseInt(request.getParameter("price"));
	  int total=Integer.parseInt(request.getParameter("total"));
	  String date=request.getParameter("bdate");
//	  
//	  System.out.println("mid:>"+mid);
//	  System.out.println("fid:>"+fid);
//	  System.out.println("eid:>"+eid);
//	  System.out.println("quantity:>"+qua);
//	  System.out.println("price:>"+price);
//	  System.out.println("total:>"+total);
//	  System.out.println("date:>"+date);
	  billingmodel model=new billingmodel();
	  model.setMid(mid);
	  model.setId(fid);
	  model.setEid(eid);
	  model.setQuantity(qua);
	  model.setPrice(price);
	  model.setTotal(total);
	    model.setBdate(date);
	  employeeservice es=new employeeserviceIMPL();
	  boolean b=es.isaddbill(model);
	  if(b)
	  {
		  RequestDispatcher o=request.getRequestDispatcher("billing.jsp");
		  o.include(request, response);
	  }
	  else
	  {
		  out.print("<h1>billing not completed....</h1");
	  }
	  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
