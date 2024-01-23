package com.edubridge.typesofvariables;

import java.util.Scanner;

public class UnicodeNumberAssingment {

	public static void main(String[] args) {
		 	Scanner s = new Scanner(System.in);
	        char x = s.next().chars()
	  		byte[] charset = str1.getBytes("UTF-8");  
	        Float y = s.nextFloat();
	        Float z = s.nextFloat();

	        //System.out.println(x);
	        //System.out.println("%.2f", x);
	        System.out.println("Float Number " +String.format("%.2f", x));
	        //System.out.println(y);
	        System.out.println("Float Number " +String.format("%.2f", y));
	        //sSystem.out.println(z);
	        System.out.println("Float Number " +String.format("%.2f", z));
	        s.close();
	 
	}

}
