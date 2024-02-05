package com.edubridge.Polymorphism;
// program to demonstrate overloading method
class Stocks{
	long sharePrice;
	String shareName;
	String shareType;
	
	//method overloading
	static void displayStockDetails(String shareName,long sharePrice){
		System.out.println(shareName+" "+sharePrice);
	}
	static void displayStockDetails(String shareName,String shareType){
		System.out.println(shareName+" "+shareType);
	}
	
}

public class MethodOverloading {
	public static void main(String[] args) {
		Stocks s = new Stocks();
		s.displayStockDetails("Birla", 4154);
		s.displayStockDetails("Tata", "Nifty-Fifty");
	}

}
