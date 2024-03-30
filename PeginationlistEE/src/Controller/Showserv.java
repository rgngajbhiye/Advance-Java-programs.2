package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PUBLIC_MEMBER;

import model.Reguser;
import model.ReguserDao;


@WebServlet("/Show")
public class Showserv extends HttpServlet {
	   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.print("hello ragini");
	
	//String spageid =request.getParameter("page");
	int page=Integer.parseInt(request.getParameter("page"));
	//int pageid= Integer.parseInt("spageid");
	int total=5;
	if(page==1)
	{
		
	}
	else
	{
		page=page-1;
		page=page*total+1;
	}
     
	try {
		List<Reguser> list=new ReguserDao().getRecords(page, total);
		
     out.print("<h1>  Page No: "+ page+"</h1>");	
     out.print("<table border='1' cellpadding ='4' width='60%'>");		
     out.print("<tr><th> Id </th><th> Username</th> <th>Lastname</th><th>Phone</th>");	
     
     for(Reguser x:list)
     {
    	 out.print("<tr><td>"+x.getId()+"</td><td>"+x.getUname()+"</td><td>"+x.getLname()+"</td><td>"+x.getPhone()+"</td></tr>");	
     }
     	
     out.print("</table>");		

		out.print("<a href='Show?page=1'>1</a>");
		out.print("<a href='Show?page=2'>2</a>");
		out.print("<a href='Show?page=3'>3</a>");
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
