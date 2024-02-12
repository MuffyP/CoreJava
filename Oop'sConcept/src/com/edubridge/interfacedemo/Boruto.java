package com.edubridge.interfacedemo;
//child class
public class Boruto implements Naruto,Hinata {

	public void power(int noOfChildren, String position) {
		System.out.println(noOfChildren+" "+position);
	}
	public void powerone(int noOfChildren, String clan) {
		System.out.println(noOfChildren+" "+clan);
	}
	
}
