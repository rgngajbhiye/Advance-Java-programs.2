package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReguserDao {
	String url="jdbc:mysql://localhost:3306/ee3";
	String name="root";
	String pass="abc123";
	
	private Connection getconnect() throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.jdbc.Driver");	
       System.out.println("driver connected");
       Connection con=DriverManager.getConnection(url,name,pass);
		return con;
	}
	     public int Save(Reguser u) throws ClassNotFoundException, SQLException {
	    	 String sql=("Insert into registeration (uname,lname,phone) values(?,?,?)");
	    	 PreparedStatement ps=getconnect().prepareStatement(sql);
	    	 System.out.println("system created");
	    	 ps.setString(1, u.getUname());
	    	 ps.setString(2, u.getLname());
	    	 ps.setString(3, u.getPhone());
	    	 
			return ps.executeUpdate();
		} 
	     
	     public List<Reguser> getRecords(int start ,int total) throws ClassNotFoundException, SQLException {
	    	 
	    	 List<Reguser> list=new ArrayList<Reguser>();
	    	 Connection con=getconnect();
	    	 String sql=("SELECT * from registeration limit "+(start-1)+","+total+" ");
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Reguser r= new Reguser();
				r.setId(rs.getInt(1));
				r.setUname(rs.getString(2));
				r.setLname(rs.getString(3));
				r.setPhone(rs.getString(4));
				list.add(r);
			}
			con.close();
			return list;
			 
		}
}
