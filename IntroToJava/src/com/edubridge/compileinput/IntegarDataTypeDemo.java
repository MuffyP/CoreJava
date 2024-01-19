package com.edubridge.compileinput;

import java.util.Scanner;

public class IntegarDataTypeDemo {
	
	
	public static void main (String[] args) {
		
		Scanner s= new Scanner(System.in);
		byte num= s.nextByte();
		short x =s.nextShort();
		int y = s.nextInt();
		long z = s.nextLong();
		System.out.println("The byte num is "+num);
		System.out.println("The byte num is "+x);
		System.out.println("The byte num is "+y);
		System.out.println("The byte num is "+z);

		s.close();
	}
}
