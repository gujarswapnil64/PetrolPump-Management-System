package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empupdate")
public class empupdate extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	  int eid=Integer.parseInt(request.getParameter("eid"));
	  String name=request.getParameter("name");
	  String email=request.getParameter("email");
	  String contact=request.getParameter("contact");
	  String address=request.getParameter("address");
	  int salary=Integer.parseInt(request.getParameter("salary"));
	  
	
	  RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
		o.include(request, response);
//		out.println("<h2>Update Machine Code</h2>");
		out.println("<div class='col-sm-2 m-5'>");
		out.println("<form name='frm' action='finalempupdate' method='post'>");
		out.println("<input type='hidden' name='eid' class='form-control  p-2' value='"+eid+"'><br>");
		out.println("<input type='text' name='name' class='form-control border border-warning border-4' value='"+name+"'><br>");
		out.println("<input type='text' name='email' class='form-control border border-warning border-4' value='"+email+"'><br>");
		out.println("<input type='text' name='contact' class='form-control border border-warning border-4' value='"+contact+"'><br>");
		out.println("<input type='text' name='address' class='form-control border border-warning border-4' value='"+address+"'><br>");
		out.println("<input type='text' name='salary' class='form-control border border-warning border-4' value='"+salary+"'><br>");
		out.println("<input type='submit' name='s' class='form-control bg-warning border-4 rounded-pill' value='UPDATE EMPLOYEE INFO...'><br><br><br>");
		out.println("</form>");
		out.println("</div></div></div>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
