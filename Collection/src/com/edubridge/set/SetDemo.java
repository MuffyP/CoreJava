package com.edubridge.set;
// HastSet, LinkedHashSet and TreeSet demo
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> obj = new HashSet<>(); //unoreded set takes random order themselves
		obj.add("Ambani");
		obj.add("Adani");
		obj.add("Azerbaijan");
		obj.add("Amit");
		System.out.println(obj);
		
		Set<String> obj1 = new LinkedHashSet<>(); //ordered set shows in sequence entered
		obj1.add("Ambani");
		obj1.add("Adani");
		obj1.add("Azerbaijan");
		obj1.add("Amit");
		System.out.println(obj1);
		
		Set<String> obj2 = new TreeSet<>(); //arranged in acssessing order
		obj2.add("Ambani");
		obj2.add("Adani");
		obj2.add("Azerbaijan");
		obj2.add("Amit");
		System.out.println(obj2);
	
	}
	

}
