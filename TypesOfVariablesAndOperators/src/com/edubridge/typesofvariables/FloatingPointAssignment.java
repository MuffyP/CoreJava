package com.edubridge.typesofvariables;

import java.util.Scanner;

public class FloatingPointAssignment {

	public static void main(String[] args) {
		// Online Java Compiler
		// Use this editor to write, compile and run your Java code online

		
		        Scanner s = new Scanner(System.in);
		        Float x = s.nextFloat();
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
