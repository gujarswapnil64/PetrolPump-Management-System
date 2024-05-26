package login_control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	   
	    String admin_email="swapnilgujar@gmail.com";
	    String admin_pass="admin@1416";
	    
	    String email=request.getParameter("email");
	    String pass=request.getParameter("pass");
	    
	    if(email.equals(admin_email) && pass.equals(admin_pass))
	    {
	    	RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
	    	o.forward(request, response);
	    }
	    else
	    {
	    	RequestDispatcher o=request.getRequestDispatcher("first_page.jsp");
	    	o.forward(request, response);
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
