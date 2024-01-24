package com.edubridge.runtimearray;

import java.util.Scanner;

/* program to demonstate MultiDimensional Array*/
public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Value Of Outside And Inside Value");
		int m=s.nextInt();
		int n=s.nextInt();
		// two-d array declaration
		int arr[][]=new int[m][n];
		//storing the array
		for(int i=0;i<m;i++) i
		{
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++) 
		{
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
