package com.edubridge.Assingment;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
	}

}
