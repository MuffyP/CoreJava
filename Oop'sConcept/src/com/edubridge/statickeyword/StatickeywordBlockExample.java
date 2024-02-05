package com.edubridge.statickeyword;
public class StatickeywordBlockExample {
	//static block is used to initialize the static variable only
	int x;
	static String name;
	
	static {
		//x=12;
		name="hello friends";
	}
	static void print() {
		System.out.println(name);
	}
	static {
		int a=10;
	}
	public static void main(String[] args) {
		System.out.println();
	}

}
// to complete using san example