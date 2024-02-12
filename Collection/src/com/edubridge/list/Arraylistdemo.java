package com.edubridge.list;

import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		//List<Object> obj = new List();
		List<Object> obj = new ArrayList<>(); //obj is datatype where evrydatatype can be stored
		obj.add("Mufaddal"); //to add data in obj
		obj.add("Plastic");
		obj.add(101);
		obj.add(57385.78483);
		System.out.println(obj);
		System.out.println(obj.get(2)); //getting data using index no
		System.out.println(obj.remove(1)); //printing removable data at index 1
		System.out.println(obj);
		
		List<String> obj1 = new ArrayList<>(); //obj is datatype where evrydatatype can be stored
		obj1.add("Mufaddal"); //to add data in obj
		obj1.add("Plastic");
		//obj1.add("101"); //cant use this because datatyoe is string
		//obj1.add("57385.78483");
		
		List<String> obj2 = new ArrayList<>(); //obj is datatype where evrydatatype can be stored
		obj2.add("Hello"); //to add data in obj
		obj2.add("world");
		obj2.addAll(obj1);
		//obj2.addAll(obj); cant use obj sice datatype are diff of both
		System.out.println(obj2);


		
	}

}
