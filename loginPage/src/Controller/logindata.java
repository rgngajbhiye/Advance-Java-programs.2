package Controller;

public class logindata {
   
	private int id;
	private	String uname;
	private String fname;
	private String email;
	private String pass;
	
	
	public logindata() {
		// TODO Auto-generated constructor stub
	}

	

	public logindata(int id, String uname, String fname, String email, String pass) {
		super();
		this.id = id;
		this.uname = uname;
		this.fname = fname;
		this.email = email;
		this.pass = pass;
	}

	public logindata(String uname, String fname, String email, String pass) {
		
		// TODO Auto-generated constructor stub
		this.uname = uname;
		this.fname = fname;
		this.email = email;
		this.pass = pass;
	}

}
