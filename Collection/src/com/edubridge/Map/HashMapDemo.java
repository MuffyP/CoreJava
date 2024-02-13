package com.edubridge.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Object> obj = new HashMap<>();
		obj.put(2, "Muffy");
		obj.put(3, "Buddy");
		obj.put(4, "Rashida");
		obj.put(8, "Rehana");
		System.out.println(obj);
		System.out.println(obj.containsKey(4));
		System.out.println(obj.remove(4));
		
	}

}
