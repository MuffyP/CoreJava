package com.edubridge.stringdemo;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		String str1="Alefiyah Sharbat";
		String str2="";
		//checking lenght using lenght method
		System.out.println(str1.length());
		char[] arr1= new char[str1.length()]; //char 
		str1.getChars(0, str1.length(), arr1, 0); //getchars method
		System.out.println(Arrays.toString(arr1));
		System.out.println(str1.compareTo("Alefiyah SHarbat"));
		System.out.println(str1.compareTo("Alefiyah Shar"));
		System.out.println(str1.compareToIgnoreCase("Alefiyah SHArbat"));
		System.out.println(str1.compareTo("Alefiyah Sharbat"));
		//System.out.println(str2.isBlank()); (its not usable in this version)
		System.out.println(str1.charAt(4));
		System.out.println("Bawa is me muffy".startsWith("ba"));
		System.out.println("Bawa is me muffy".startsWith("Ba"));
		System.out.println("Bawa is me muffy".endsWith("fy"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println("  there is a FAn Boy here   ".trim());
		//System.out.println("  there is a FAn Boy here   ".strip());
		//System.out.println(str1.repeat(2)); doesnt work in 1.8

	}

}
