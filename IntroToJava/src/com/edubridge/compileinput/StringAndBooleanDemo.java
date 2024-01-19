package com.edubridge.compileinput;

import java.util.Scanner;

public class StringAndBooleanDemo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean x = s.nextBoolean();
		String y = s.next();
		s.next();
		String a = s.nextLine();
		
		//s.next();
		char z = s.next().charAt(0);

		System.out.println("value of boolean is "+ x);
		System.out.println("The string is "+y);
		System.out.println("The string line is "+a);
		System.out.println("The char is "+z);

		s.close();
	}
}
