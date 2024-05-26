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

import com.mysql.cj.x.protobuf.MysqlxConnection.Close;


@WebServlet("/logout")
public class logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();		
		
		HttpSession session=request.getSession(true);
//		System.out.println(session);
		
		try {
		Object obj=session.getAttribute("eid");
		String s=String.valueOf(obj);
		int eid=Integer.parseInt(s);
		
			if(eid!=0)
			{
				session.invalidate();
		     RequestDispatcher o=request.getRequestDispatcher("first_page.jsp");
		     o.forward(request, response);
			}
		}
		catch(Exception ex)
		{
    		response.sendRedirect("first_page.jsp");
			System.out.println("error is logout.java(servlet).....>"+ex);
		}

	}

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
