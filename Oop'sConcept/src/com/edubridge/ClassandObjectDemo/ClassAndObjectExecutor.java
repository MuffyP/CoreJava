package com.edubridge.ClassandObjectDemo;
//Program to demon class and object //creating class
class Vegetables{
	//variable or fields
	String vegetableName;
	int price;
	
	//method(also called function)
	void print(){
		System.out.println("Vegetable Name: "+ vegetableName +"\nPrice is: "+ price);
	}
}

public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		//creating object using new keyword
		Vegetables v = new Vegetables(); //by default constructor made by jvm Vegetables()
		v.vegetableName="LadyFinger";
		v.price=40;
		v.print();
	}

}
