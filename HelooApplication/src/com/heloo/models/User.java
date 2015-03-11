package com.heloo.models;
import java.util.Date;

public class User {

	private String id;
	private String fname;
	private String lname;
	private String gender;
	private String email;
	private String numbertel;
	private String login;
	private String password;
	
	private String address;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname1) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumbertel() {
		return numbertel;
	}

	public void setNumbertel(String numbertel) {
		this.numbertel = numbertel;
	}
    
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	} 
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
