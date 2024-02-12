package com.edu.oopsdemo;
//polymorphism

public class Sports{
	String SportName;
	int noOfPlayer;
	public void play(String SportName,int noOfPlayer) {
		this.SportName=SportName;
		this.noOfPlayer= noOfPlayer;
	}
}
class Football extends Sports{
	public void play(String SportName,int noOfPlayer){
		System.out.println(SportName+" "+noOfPlayer);
		
	}
}
class Basketball extends Sports{
	public void play(String SportName,int noOfPlayer){
		System.out.println(SportName+" "+noOfPlayer);
	}
}
class Rugby extends Sports{
	public void play(String SportName,int noOfPlayer){
		System.out.println(SportName+" "+noOfPlayer);
	}
}



