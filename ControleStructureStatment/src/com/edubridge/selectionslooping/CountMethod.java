package com.edubridge.selectionslooping;
import java.util.*; 

public class CountMethod {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		System.out.println(count);

	}

}
