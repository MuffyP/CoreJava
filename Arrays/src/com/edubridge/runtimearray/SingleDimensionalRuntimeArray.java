package com.edubridge.runtimearray;

import java.util.Scanner;

public class SingleDimensionalRuntimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//array declaration
		int arr[]= new int[n];
		// to initialize an array element
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		// to print array
		System.out.println("Value of array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
