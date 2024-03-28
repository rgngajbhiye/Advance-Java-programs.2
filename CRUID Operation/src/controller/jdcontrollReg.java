package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import model.UserDao;


@WebServlet("/cntrl")
public class jdcontrollReg extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		String address=request.getParameter("address");
		String bn=request.getParameter("btn");
		User u=new User(uname,upass,address);
		int a = 0,b = 0,c = 0;

		switch (bn) 
		{
		case "Insert":
			
			
			try {
				 a=new UserDao().Save(u);

		} catch (ClassNotFoundException |SQLException e2) {
			e2.printStackTrace();
		} 			if(a>0)
		{
			out.print("<th> welcome  "+uname+" Data inserted </th>");
		}
		break;
		case "Update":
			
       	 try {
       			 b=new UserDao().update(u);

			} catch (ClassNotFoundException|SQLException e1) {
				e1.printStackTrace();
			}  			if(b>0)
			{
				out.print("<th> welcome  "+uname+" Data updated </th>");
			}
			break;
			
         case "Delete":
       	  
       	   try {
       			 c=new UserDao().Delete(u);

			} catch (ClassNotFoundException|SQLException e) {
				e.printStackTrace();
			} 			
 			if(c>0)
 			{
 				out.print("<th> welcome  "+uname+" Data deleted </th>");
 			}
	break;
	
		
	default:
		out.print("<th>sorry Error try again </th>");

		break;
		}
	
		
		}
		
	
	

	
	
	
	
		/*
		try {
		
		
		
		
		
		
		
		
		
		
			int a= new UserDao().Delete(u);
			if(a>0)
			{
				out.print("<th> welcome  "+uname+" Data updated </th>");
			}
			else
			{
				out.print("<th>sorry Error try again </th>");
			}
			
		} catch (ClassNotFoundException| SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
	
         
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
		
	}

}
