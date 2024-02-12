package com.edubridge.abstractclassdemo;
//implemantable class or child class
public class ISRO extends GovernmentAgency{
//if any class has one or more abstartc method then it must be declared in its clid class
	@Override
	void displayDeatils() {
		System.out.println("Indian Space Research "+"Organization");
	}

	@Override
	void displayDeatils(String agencyName, long yearlyBudget) {
		System.out.println("Agency Name: "+agencyName+"\nYearly Budget: "+yearlyBudget);
	}
	

}
