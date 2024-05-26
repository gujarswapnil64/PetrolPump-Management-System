package login_control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import admin.model.employeemodel;
import services.employeeservice;
import services.employeeserviceIMPL;


@WebServlet("/login")
public class loginpage extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	
	String email=request.getParameter("email");
	String pass=request.getParameter("pass");
	 
//	System.out.println(email);
//	System.out.println(pass);
	
    employeeservice es=new employeeserviceIMPL();
     int value=es.varifyEmployee(email, pass);
     employeemodel m=es.getprofile(value);
     int mid=es.getmid(value);
//     System.out.println("MID Access thai gai bhai"+mid);
     if(value!=0) {
//    	 System.out.println("login page meno id:>>"+value);
//    	 System.out.println("login page meno email:>>"+email);
//    	 System.out.println("login page meno contact:>>"+m.getContact());
//    	 System.out.println("login page meno address:>>"+m.getAddress());
    	 HttpSession session=request.getSession(true);
    	 session.setAttribute("eid", m.getEid());
    	 session.setAttribute("email", m.getEmail());
    	 session.setAttribute("contact",m.getContact());
    	 session.setAttribute("address",m.getAddress());
    	 session.setAttribute("name",m.getName());
    	 session.setAttribute("salary",m.getSalary());
//    	System.out.println(session.getAttribute("eid")) ;
//    	System.out.println(session.getAttribute("email")) ;
    	 
    	 RequestDispatcher o=request.getRequestDispatcher("employee_login_dashboard.jsp");
    	 o.forward(request, response);
     }
     else {
    	 RequestDispatcher o=request.getRequestDispatcher("first_page.jsp");
    	 o.include(request, response);
    	 out.print("<h1>not login</h1>");
     }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
