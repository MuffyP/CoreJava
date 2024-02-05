package com.edubridge.Inheritance.multilevelinheritance;

public class pulsar {
	public int Speed;
	public int price;
	
	
	public pulsar(int speed, int price) {
		super();
		Speed = speed;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "pulsar [Speed=" + Speed + ", price=" + price + "]";
	}



	/*void Display(){
		//super.Display();
		System.out.println(learnerName+" "+rollNo);
	}*/
}
