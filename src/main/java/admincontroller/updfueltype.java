package admincontroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updfueltype")
public class updfueltype extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        int fcode=Integer.parseInt(request.getParameter("id"));
        String fname=request.getParameter("name");
        
        RequestDispatcher o=request.getRequestDispatcher("adminpanalboard.jsp");
    	o.include(request, response);
    	out.println("<div class='col-sm-2 m-5'>");
    	out.println("<form name='frm' action='finalfuelupdate' method='post'>");
    	out.println("<input type='hidden' name='fid' class='form-control  p-2' value='"+fcode+"'><br>");
    	out.println("<input type='text' name='fname' class='form-control border border-warning border-4' value='"+fname+"'><br>");
    	out.println("<input type='submit' name='s' class='form-control bg-warning border-4 rounded-pill' value='UPDATE Fuel Name...'><br><br><br>");
    	out.println("</form>");
    	out.println("</div></div></div>");
    	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
