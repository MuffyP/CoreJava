package com.edu.genirics;
//.program to demonstarte on generic class by passing 
//multiple parametres of different data type
class Dictionary<K,V>
{	
	//where t defines any kind of Type Values
	K Key;
	V Val;
	void print(K Key,V Val) {
		this.Key=Key;
		this.Val=Val;
		System.out.println("The value is "+Key+" "+Val);
	}
}
//driver class
public class GeniricClassForMap {
	public static void main(String[] args) {
		Dictionary<Character,String> c =new Dictionary<>();
		c.print('I',"India");
		c.print('S',"Synchronization");
	}
}
