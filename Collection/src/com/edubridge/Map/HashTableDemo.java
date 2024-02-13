package com.edubridge.Map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<Integer,Object> obj1 = new Hashtable<>();
		obj1.put(2, "Muffy");
		obj1.put(3, "Buddy");
		obj1.put(4, "Rashida");
		obj1.put(8, "Rehana");
		//obj1.put(22, null);
		//we can't use value or key as null or else well get null pointer error
		System.out.println(obj1);
	}

}
