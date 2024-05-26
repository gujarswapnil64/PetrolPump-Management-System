package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.model.addmachine;
import services.machineservice;
import services.machineserviceIMPL;


@WebServlet("/updmachine")
public class updatemachineservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	int mid=Integer.parseInt(request.getParameter("mid"));
	String mcode=request.getParameter("mcode");
	RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
	o.include(request, response);
//	out.println("<h2>Update Machine Code</h2>");
	out.println("<div class='col-sm-2 m-5'>");
	out.println("<form name='frm' action='finalserv' method='post'>");
	out.println("<input type='hidden' name='mid' class='form-control  p-2' value='"+mid+"'><br>");
	out.println("<input type='text' name='mcode' class='form-control border border-warning border-4' value='"+mcode+"'><br>");
	out.println("<input type='submit' name='s' class='form-control bg-warning border-4 rounded-pill' value='UPDATE MACHINE CODE...'><br><br><br>");
	out.println("</form>");
	out.println("</div></div></div>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
