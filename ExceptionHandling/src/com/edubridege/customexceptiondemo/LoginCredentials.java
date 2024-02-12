package com.edubridege.customexceptiondemo;
//custom exception
public class LoginCredentials extends Exception{
	//for error messgae
	private String str;

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	
}
