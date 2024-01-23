package com.edubridge.operators;
//Program to Demonstrate on Logical Operator
import java.util.Scanner;

public class LogicalOperatorDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.println("Enter Boolean Value of A & B");
		Boolean a =s.nextBoolean();
		Boolean b =s.nextBoolean();
		System.out.println(a && b);
		System.out.println(a||b);
		System.out.println(!b);
		
		
		int c =s.nextInt();
		int d =s.nextInt();
		System.out.println(c==4 && d<c);
		System.out.println(c>d || c!=d);
		System.out.println(!(c>=d));
		s.close();
	}

}
