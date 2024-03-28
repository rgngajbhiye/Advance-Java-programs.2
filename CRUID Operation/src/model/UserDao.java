package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {

	String url="jdbc:mysql://localhost:3306/ee3";
	String name="root";
	String pass="abc123";
	
	 private Connection getConnect() throws ClassNotFoundException, SQLException {
		 
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("driver connected");
		 Connection con=DriverManager.getConnection(url,name,pass);
		 return con;
		
	}
	 public int Save(User u) throws ClassNotFoundException, SQLException {
		 String sql=("Insert into user (uname,upass,address) values(?,?,?)"); 
		 PreparedStatement ps=getConnect().prepareStatement(sql);
		 System.out.println("Statement created");
		 
		 ps.setString(1, u.getUname());
		 ps.setString(2, u.getUpass());
		 ps.setString(3, u.getAddress());
 
		return ps.executeUpdate();
		
	}
	 
	 
	 public int update(User u) throws ClassNotFoundException, SQLException {
		 String sql=("UPDATE user SET address=?,upass=? WHERE uname=?"); 
		 PreparedStatement ps=getConnect().prepareStatement(sql);
		 System.out.println("Statement created");
		 
		ps.setString(3, u.getUname());
		ps.setString(2, u.getUpass());
		ps.setString(1, u.getAddress());
 
		return ps.executeUpdate();
		
	}
	 
	 public int Delete(User u) throws ClassNotFoundException, SQLException {
		 String sql=("DELETE from user WHERE uname=?"); 
		 PreparedStatement ps=getConnect().prepareStatement(sql);
		 System.out.println("Statement created");
		 
		ps.setString(1, u.getUname());
		//ps.setString(2, u.getUpass());
		//ps.setString(1, u.getAddress());
 
		return ps.executeUpdate();
		
	}
}
