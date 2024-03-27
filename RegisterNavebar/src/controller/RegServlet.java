package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;

@WebServlet("/Reg")
public class RegServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname=request.getParameter("uname");
	    String upass=request.getParameter("upass");
		String address=request.getParameter("address");
		//out.print("<a href=''>Home</a> | <a href='about.html'>about us</a> | <a href=''>contact</a> <br/><br/><br/><br/>");
		RequestDispatcher dispatcher=request.getRequestDispatcher("navbar.html");
		dispatcher.include(request, response);
		
	    User u=new User(uname, upass, address);
	    
	    try {
	    
			int a=new UserDao().save(u);
			if(a>0)
			{
				out.print("Welcome "+uname+" Data Inserted!");
				//out.print("<a href='profile'>click</a>");
				//response.sendRedirect("profile");
			    request.getRequestDispatcher("profile").forward(request, response);
			}
			else
			{
				out.print("Sorry Error");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
