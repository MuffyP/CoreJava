package com.edubridge.selectionstatment;

import java.util.Scanner;

public class WhileLoopStatment {

	public static void main(String[] args) {
		int i = 1;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		while(i<=N)
		{
			System.out.println(i+" "); 
			i++;
		}

	}

}
