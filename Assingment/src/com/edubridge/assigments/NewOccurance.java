package com.edubridge.assigments;

import java.util.Scanner;

public class NewOccurance {

	public static void main(String[] args) {
		// Remove extra 'the' in user input
		Scanner s=new Scanner(System.in);
		String a= s.nextLine();
		a = a.replaceAll("the", "");
		// can use substring
		a=a.substring(0, a.length());
		System.out.println(a);
	}

}
