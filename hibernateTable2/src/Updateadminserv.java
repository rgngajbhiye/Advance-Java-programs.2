

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Adminentity2;


@WebServlet("/serv2")
public class Updateadminserv extends HttpServlet {
	
	
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	 
	 PrintWriter out=response.getWriter();
	 //error id not retrived from jsp page
		int uid=Integer.parseInt(request.getParameter("id"));

	 
	 String name=request.getParameter("name");
	 String phone=request.getParameter("phone");
	 String email=request.getParameter("email");
	 String password=request.getParameter("password");
	 
	 Configuration cfg=new Configuration();
	 // error xml file not added
	 cfg.configure("hibernate.cfg.xml");
	 
	 SessionFactory factory=cfg.buildSessionFactory();
	 Session session=factory.openSession();
	 Transaction tx=session.beginTransaction();
	 
	 Adminentity2 u=new Adminentity2(name, phone, email, password);
	 session.update(u);
	 
	 tx.commit();
	 session.close();
	 out.print("Data Updated Successfully..");
	 out.print("<a href='Show.jsp'>update</a>");
	 
	 
	 
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	

}
