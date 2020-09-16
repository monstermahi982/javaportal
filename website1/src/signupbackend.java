

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupbackend")
public class signupbackend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		//pw.print("Welcome to Monster World");
		
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		databasecon dt = new databasecon();
		int status = dt.insertData(name,mobile,email,username,password);
		if(status == 1) {
			
			RequestDispatcher view = request.getRequestDispatcher("profile.jsp");
			view.forward(request, response);
		}
		else {
			pw.print("something went Wrong");
			System.out.println("error4");
		}
		
	}
}



