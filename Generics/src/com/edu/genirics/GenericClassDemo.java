package com.edu.genirics;
//.program to demonstarte on generic class by passing sing data type
class Citizen<T>
{	
	//where t defines any kind of Type Values
	T str;
	T str1;
	void print(T str,T str1) {
		this.str=str;
		this.str1=str1;
		System.out.println("The value is "+str +" "+str1);
	}
}
//driver class
public class GenericClassDemo {

	public static void main(String[] args) {
		Citizen<String> c =new Citizen<>();
		c.print("Mumbai","India");
	}

}
