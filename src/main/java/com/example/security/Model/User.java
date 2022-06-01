package com.example.security.Model;

public class User {

	
	private String userName;
	private String password;
	private String mail;
	
	public User(String userName, String password, String mail) {
		super();
		this.userName = userName;
		this.password = password;
		this.mail = mail;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
}
