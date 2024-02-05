package com.edubridge.Inheritance.singleinheritance;

public class Learner extends Trainer {
	public String learnerName;
	public int rollNo;
	
	void Display(){
		super.Display();
		System.out.println(learnerName+" "+rollNo);
	}
	
}
