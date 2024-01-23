package com.edubridge.operators;
// Program to Demonstrate IncrementAndDecremnet 
import java.util.Scanner;

public class IncrementAndDecrementOperatorDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.println("Enter Value of A & B:");
		int a =s.nextInt();
		int b =s.nextInt();
		int res = a++ - ++b;
		int res2= --a + b--;
		System.out.println(a);
		System.out.println(b);
		s.close();
	}

}
