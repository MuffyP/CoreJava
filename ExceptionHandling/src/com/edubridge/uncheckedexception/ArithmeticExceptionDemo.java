package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int x =5;
		System.out.println("Enter the value of y");
		try {
			int y =s.nextInt();
			System.out.println(x/y);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occured"+e);
		
		}
		s.close();

	
		
}
}
