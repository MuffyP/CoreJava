package com.edubridge.list;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List<Object> obj = new Vector<>();
		obj.add("Mufaddal");
		obj.add(45);
		obj.add(45454.898);
		obj.add(true);
		obj.add('Z');
		System.out.println(obj);
		
		for(Object itr:obj) {
			System.out.print(itr+" ");
		}
	}

}
