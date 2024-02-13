package com.edubridge.list;
// program  to demonstrate linked list

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Object> obj = new LinkedList<>(); //obj is datatype where evrydatatype can be stored
		obj.add("Mufaddal"); //to add data in obj
		obj.add("Plastic");
		obj.add("101");
		obj.add("57385.78483");
		System.out.println(obj);
		
		List<Integer> obj1 = new LinkedList<>(); //obj is datatype where evrydatatype can be stored
		obj1.add(101); //to add data in obj
		obj1.add(85);
		obj1.add(8754);
		obj1.add(945);
		System.out.println(obj1);
		obj1.add(2, 786); //index and data to add at thta index
		System.out.println(obj1);
		System.out.println(obj1.contains(945)); //checks if data is in the list
		System.out.println(obj.getClass()); // gives the class in which the list is
		//obj.clear(); //complet;y clears the list
		//System.out.println(obj);
		
		for(Object itr:obj) { //enhanced for loop is used(learn loops)
			System.out.print(itr+" ");
			
		}
		/*Iterator<Integer> itr1 = obj1.listIterator();
		while(itr1.hasNext()) {
			System.out.print(itr1+" ");
		}*/
		Collections.reverse(obj);
		for(Object itr:obj) { //enhanced for loop is used(learn loops)
			System.out.print(itr+" ");
			
		}
		//Collections.sort(); check how to use
		}
}
