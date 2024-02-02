package com.edubridge.packtwo;

import com.edubridge.packone.AccessSpecifierDemo;
//import com.edubridge.packone.AccessSpecifierDemo; we can type or import both
public class AccessSpecifierProgram {

	public static void main(String[] args) {
		AccessSpecifierDemo obj=new AccessSpecifierDemo();
		//atm_pinNo is private cant access in other class or getter setter
		//obj.atm_pinNo=2232;
		//displayPinNo() is private method cant access in other class
		//obj.displayPinNo();
		obj.emailId="muffyp27@gmail.com";
		obj.displayEmail(); //can display since its public variable & method
		//obj.percentage=87; cant see since default is not visible in othr package can use gettersetter
		//obj.displayPercentage(); cant see since default is not visible in othr package can use gettersetter
	}
}
