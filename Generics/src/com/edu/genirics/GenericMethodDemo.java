package com.edu.genirics;
public class GenericMethodDemo {

	public static <E> void Accept(E[] arr)
	{
		for(E itr:arr) {
			System.out.print(itr+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer arr1[]= {66,565,434,2323,2323,456546,5656};
		Integer[] arr2= {66,565,434,2323,2323,456546,5656};
		System.out.println("Array one is:");
		GenericMethodDemo.Accept(arr1);
		System.out.println("Array two is:");
		GenericMethodDemo.Accept(arr2);
	}

}
