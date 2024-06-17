package pack.loginCredentials;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AcceptLoginInfo extends HttpServlet{


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String email=req.getParameter("uemail");
		String content=req.getParameter("content");
		if(email.equals("abc123@gmail.com")) {
			
		}
		out.println("<h2>Email:- "+email+"</h2>");
		out.println("<h3>Description:- "+content+"</h3>");
		
	}

	
}
