

	package model;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class UserDao {
		String url="jdbc:mysql://localhost:3306/ee2";
		String name="root";
		String pass="abc123";
		
		private Connection getConnect() throws ClassNotFoundException, SQLException
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,name,pass);
			
			return con;
		}
		
		public int save(User u) throws ClassNotFoundException, SQLException
		{
			String sql="Delete ee2table (uname, upass, address) WHERE uname=?";
			PreparedStatement ps=getConnect().prepareStatement(sql);
			ps.setString(1, u.getUname());
			ps.setString(2, u.getUpass());
			ps.setString(3, u.getAddress());

			return ps.executeUpdate();
		}

		
		
		
		
	}
	
	
	

