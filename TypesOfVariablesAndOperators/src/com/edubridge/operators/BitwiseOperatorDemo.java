package com.edubridge.operators;
//Program to try bitwise and Shifting Operator
import java.util.Scanner;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
        System.out.println("Enter Value of A & B:");
		int a =s.nextInt();
		int b =s.nextInt();
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(a<<b);
		System.out.println(a>>b);
		s.close();
	}

}
