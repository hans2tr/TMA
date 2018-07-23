package com.model;

public class Account {
	private String id;
	private String username;
	private String password;

	public Account(String id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Account() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean checkAccount(String username, String pass) {
		if(username.equalsIgnoreCase("Han")&&pass.equalsIgnoreCase("123")) {
			return true;
		}
		return false;
	}
}
