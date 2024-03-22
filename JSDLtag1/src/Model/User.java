package Model;

public class User {
  private int id;
  private String uname;
  private String lname;
  private String pass;
  
  public User() {
		super();
		
	}

  
  public User( String uname, String lname, String pass) {
		super();
		
		this.uname = uname;
		this.lname = lname;
		this.pass = pass;
	}

public User(int id, String uname, String lname, String pass) {
	super();
	this.id = id;
	this.uname = uname;
	this.lname = lname;
	this.pass = pass;
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


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getPass() {
	return pass;
}


public void setPass(String pass) {
	this.pass = pass;
}
  
}
