package com.edu.genirics;

import java.util.ArrayList;
import java.util.List;

public class GeniricsAdvantageDemo {

	public static void main(String[] args) {
		// Type Safety
		List<String> obj = new ArrayList<>();
		///it ensures we only add string
		//obj.add(78);
		obj.add("78");
		obj.add("Hello");
		
		// TYPE cASTING IS NOT REQUIRED 
		//List obj1 = new ArrayList<>();
		List<String> obj1 = new ArrayList<>();
		///it ensures we only add string
	
		obj1.add("Muffy Plastic");
		obj1.add("Alefiyah Plastic");
		//without genirics type casting is required
		//String str1 = (String) obj1.get(0);
		String str= obj1.get(1);
		System.out.println(str);
		

	}

}
