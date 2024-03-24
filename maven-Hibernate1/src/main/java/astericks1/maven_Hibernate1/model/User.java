package astericks1.maven_Hibernate1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user100")


public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int uid;

	@Column(name="uname")
private String name;

private String pass;

public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public User() {
	super();
	}

public User( String name, String pass) {
	super();
	this.name = name;
	this.pass = pass;
}
public User(int uid, String name, String pass) {
	super();
	this.uid = uid;
	this.name = name;
	this.pass = pass;
}

}
