package com.edubridge.Polymorphism;

class Renault
{
	String carName;
	String carColor;
	int NoOfSeater;
	String engineType;
	int carPrice;
	
	//constructor overloading
	Renault(String carName,String carColor,int NoOfSeater){
		this.carName= carName;
		this.carColor = carColor;
		this.NoOfSeater = NoOfSeater;
		System.out.println(carName+" "+carColor+" "+NoOfSeater);
	}
	Renault(String carName,int carPrice, String engineType){
		this.carName= carName;
		this.carPrice = carPrice;
		this.engineType = engineType;
		System.out.println(carName+" "+carPrice+" "+engineType);
	}
}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		Renault  r =new Renault("Duster", 560000, "Petrol");
		Renault  r1 =new Renault("Rxe","yellow",6);
	}

}
