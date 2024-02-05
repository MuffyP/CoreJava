package com.edubridge.statickeyword;

public class statickeyworddemo {
	/*when variable name is non static and  trying to access the variable in main method
	 * it'll show error so we have to use static keyword
	 * */
	static float percentage= 87.9f;
	
	public static void main(String[] args) {
		System.out.println(percentage);
	}

}
