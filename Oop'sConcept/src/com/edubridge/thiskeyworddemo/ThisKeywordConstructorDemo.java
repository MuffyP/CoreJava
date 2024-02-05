package com.edubridge.thiskeyworddemo;
// to invoke current classs constructor
public class ThisKeywordConstructorDemo {
	
	ThisKeywordConstructorDemo(){
		this(26); // this refers ThisKeywordConstructorDemo(int x) constructor
		System.out.println("Non Parametrized");
	}
	ThisKeywordConstructorDemo(int x){
		System.out.println(" Parametrized "+x);
	}
	public static void main(String[] args) {
		ThisKeywordConstructorDemo obj = new ThisKeywordConstructorDemo();
		
	}

}
