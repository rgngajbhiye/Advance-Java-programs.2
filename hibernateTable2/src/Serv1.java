

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


@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");;
		String email=request.getParameter("email");;
		
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory =cfg.buildSessionFactory();
		Session session =factory.openSession();
		
		
		Adminentity2 a=new Adminentity2(name, phone, email, password);
		
		Transaction tx=session.beginTransaction();
		session.save(a);
		out.print("<br><a href='Show.jsp'>update</a>");
		System.out.println("Object Saved Successfully.......!!");
		tx.commit();
		session.close();
		factory.close();
		out.print("<br><a href='Show.jsp'>update</a>");
		out.println("DATA INSERTED ..!! <a href='Show.jsp'>update</a>:"+name+""+password+phone+"<a href='Show.jsp'>update</a>");
		out.print("<a href='Show.jsp'>update</a>");

		
		out.print("<br><a href='Show.jsp'>update</a>");
		
		out.println("<br><a href='Show.jsp'>update</a>");
		out.println("DATA INSERTED ..!! : " + name + " " + password);
		out.println("<br><a href='Show.jsp'>update</a>");
		out.println("link of update");

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
