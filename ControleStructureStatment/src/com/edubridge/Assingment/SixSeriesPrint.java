package com.edubridge.Assingment;

import java.util.Scanner;

public class SixSeriesPrint {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int a= 6;
		for(int i=0;i<n;i++) {
			int b =a+5*i;
			a=b;
			System.out.print(b+" ");
		}
	}

}
