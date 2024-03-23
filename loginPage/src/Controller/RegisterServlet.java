package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.UserRegistn;
import Model.UserRegistrationDao;
import Model.logindataDao;

@WebServlet("/RegServ")
public class RegisterServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname= request.getParameter("uname");
		String fname=request.getParameter("fname");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		 logindata log=new logindata(uname,fname,email,pass);
		  
		 int c;
		 c=new logindataDao().Insert(log);
		 
		out.print("gj");
		///USER REGISTRATION
		
		UserRegistn usr=new UserRegistn(uname,fname,email,pass);
		
		int b;
		b= new UserRegistrationDao().Insert(usr);
		
		
	}
	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
