

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginbackend")
public class loginbackend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		//pw.print("Welcome to Monster World");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(datalogin.display(username,password)) {
			 RequestDispatcher rd=request.getRequestDispatcher("profile.jsp");  
		     rd.forward(request,response);  
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("invalid.jsp");  
	        rd.forward(request,response);
		}
		
		pw.close();
	}

}
