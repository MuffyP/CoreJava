package com.edubridge.compiletimearray;

public class CompileTimeArray {

	public static void main(String[] args) {
		char[] arr= {'x','t','T','G'};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		//System.out.print(arr[5]+" "); out of bound error

	}

}
