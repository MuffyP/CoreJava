package com.edubridge.packone;
/*program to demo on public,private
 * and default access specifier*/
public class AccessSpecifierDemo {
	
	private int atm_pinNo; //private variable
	public String emailId;
	float percentage;
	
	private void displayPinNo()
	{
		System.out.println(atm_pinNo);
	}
	public void displayEmail()
	{
		System.out.println(emailId);
	}
	void displayPercentage()
	{
		System.out.println(percentage);
	}

	

}
