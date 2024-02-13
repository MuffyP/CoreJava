package com.edubridge.Map;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,Object> obj1 = new LinkedHashMap<>();
		obj1.put(2, "Muffy");
		obj1.put(3, "Buddy");
		obj1.put(4, "Rashida");
		obj1.put(8, "Rehana");
		System.out.println(obj1);
		System.out.println(obj1.containsKey(4));
		System.out.println(obj1.remove(4));
		
		for(Map.Entry<Integer,Object> itr:obj1.entrySet()) {
			System.out.print(itr.getValue()+" "+itr.getKey()+"\n");
		}

	}

}
