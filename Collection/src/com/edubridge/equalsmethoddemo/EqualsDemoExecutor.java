package com.edubridge.equalsmethoddemo;

public class EqualsDemoExecutor {

	public static void main(String[] args) {
		String str1 ="Muffy";
		String str2 ="Muffy";
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		String str3 = new String("Muffy");
		String str4 = new String("Muffy");
		System.out.println(str3.equals(str4));
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		EqualsDemoSite obj = new EqualsDemoSite("Muffy",1);
		EqualsDemoSite obj1 = new EqualsDemoSite("Muffy",1);
		System.out.println(obj.equals(obj1));
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}

}
