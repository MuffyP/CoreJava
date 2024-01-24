package com.edubridge.selectionstatment;

import java.util.Scanner;

public class NestedStatment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age and  weight of a persion:");
		int age=s.nextInt();
		int weight=s.nextInt();
		if (age>=12)
		{
			if((weight>=45 && weight<=110) || weight>110)
			{
				System.out.println("Eligible for bunjee jumping.");
			}
			else
			{
				System.out.println("Not Eligible for bunjee jumping.");
			}
		}
		else 
		{
			System.out.println("Not Eligible for bunjee jumping.");
		}
	}
}
				
		
	


