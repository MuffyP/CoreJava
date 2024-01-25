package com.edubridge.stringdemo;

public class StringExample {

	public static void main(String[] args) {
		//1.by using String Literal
		String str1="Mufaddal";
		String str2="Mufaddal";
		//2.by using new method
		String str3=new String("Mufaddal");
		String str4=new String("Mufaddal");
		//check using == operator
		System.out.println(str1==str2);
		System.out.println(str1==str4);
		System.out.println(str3==str4);
		//check using equals Method
		System.out.println(str1.equals(str4));
		System.out.println(str3.equals(str4));
	}

}
