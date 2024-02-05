package com.edubridge.thiskeyworddemo;
/* this keyword is used inside the ,method call
 * */
public class ThisKeywordMethodCallEx {
	
	void printone(ThisKeywordMethodCallEx objname) {
		// we pass Main And obj name as parqameter to use this keyword in other calling method
		System.out.println("Hello Muffy Here");
	}
	void printtwo() {
		printone(this);
	}

	public static void main(String[] args) {
		ThisKeywordMethodCallEx objname = new ThisKeywordMethodCallEx();
		objname.printtwo();
	}

}
