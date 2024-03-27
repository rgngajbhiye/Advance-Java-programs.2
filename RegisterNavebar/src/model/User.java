package model;

public class User {



	//model /pojo
	
	private int id;
	private String uname;
	private String upass;
	private String address;


	public User() {
		super();
	}

	public User(String uname, String upass, String address) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.address = address;
	}
	public User(int id, String uname, String upass, String address) {
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.address = address;
	}

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
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	

	
	
}
