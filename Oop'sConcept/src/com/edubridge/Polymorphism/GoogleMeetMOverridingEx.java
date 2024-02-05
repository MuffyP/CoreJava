package com.edubridge.Polymorphism;

public class GoogleMeetMOverridingEx extends GoogleMOverridingEx  {
	String appName;
	String emailId;
	public void accept(String appName, String emailId){
		super.accept("Google", "Muffy@gmail.com");
		System.out.println("appName"+" "+emailId);
	}	

}
