package com.edu.oopsdemo;

public class polymorphismexecutor {
	public static void main(String[]args) {
		Football f =new Football();
		f.play("Football", 22);
		Rugby r =new Rugby();
		f.play("Rugby", 14);
		Basketball b =new Basketball();
		f.play("Basketball", 16);
	}
		
	

}
