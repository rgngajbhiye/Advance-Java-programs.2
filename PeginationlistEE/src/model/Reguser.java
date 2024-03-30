package model;

public class Reguser {

	private int id;
	private String uname;
	private String lname;
	private String phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	 
	public Reguser() {
		super();	
	}
	
	public Reguser( String uname, String lname, String phone) {
		super();
	
		this.uname = uname;
		this.lname = lname;
		this.phone = phone;
	}
	
	public Reguser(int id, String uname, String lname, String phone) {
		super();
		this.id = id;
		this.uname = uname;
		this.lname = lname;
		this.phone = phone;
	}
	 	
	
}
