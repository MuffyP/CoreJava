package com.edubridge.operators;

import java.util.Scanner;

public class TernanryOperatorDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.println("Enter Number to check odd or even");
		int a =s.nextInt();
		String res= (a%2==0)?"Even":"Odd";
		System.out.println(res);
		s.close();
	}

}
