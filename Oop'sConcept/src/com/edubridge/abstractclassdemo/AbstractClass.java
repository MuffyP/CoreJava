package com.edubridge.abstractclassdemo;

import java.util.Scanner;

public class AbstractClass {
	public static void main(String[]args) {
		ISRO obj =new ISRO();
		Scanner s= new Scanner(System.in);
		System.out.println(obj.display());
		obj.displayDeatils();
		obj.setAgencyName("ISRO");
		obj.setYearlyBudget(77878778);
		System.out.println("Enter Goverment Agency Name: ");
		String x=s.next();
		System.out.println("Enter Goverment Agency Yearly Budget: ");
		long y = s.nextLong();
		obj.displayDeatils(x, y);
	}

}
