package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/profile")
public class DemoServ extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
	    String upass=request.getParameter("upass");
		String address=request.getParameter("address");
		//out.print("<a href=''>Home</a> | <a href='about.html'>about us</a> | <a href=''>contact</a> <br/><br/><br/><br/>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("navbar.html");
		dispatcher.include(request, response);
		
		out.print("Welcome profile Servlet "+uname+" "+upass+" "+address);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
