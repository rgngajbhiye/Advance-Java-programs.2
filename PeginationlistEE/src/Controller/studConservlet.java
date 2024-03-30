package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Reguser;
import model.ReguserDao;


@WebServlet("/userv")
public class studConservlet extends HttpServlet {
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		System.out.println("hello");
		String uname=request.getParameter("uname");
		String lname=request.getParameter("Lname");
		String phone=request.getParameter("phone");
		//String course=request.getParameter("course");
		RequestDispatcher dispatcher=request.getRequestDispatcher("help.html");
		dispatcher.include(request, response);
		Reguser u = new Reguser(uname,lname,phone);
		try {
			int a=new ReguserDao().Save(u);
			if(a>0)
			{
				out.print("<th>Welcome    "    +uname+   "  Data inserted</th><br><br>");
				
				out.print("<a href='Show?page=1'>ViewDetails</a>");
				
			}
			else
			{
				out.print("sorry Error");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	 }

}
