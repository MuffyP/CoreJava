package com.edubridge.compiletimearray;
//Program to demonstrate on Deep Copy Clone
public class DeepCopyArrayDemmo {

	public static void main(String[] args) {
		int arr1[]= {2,45,874,45};
		int arr2[]= arr1.clone();
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		
	}

}
