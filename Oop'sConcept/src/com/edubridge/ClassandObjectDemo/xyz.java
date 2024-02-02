package com.edubridge.ClassandObjectDemo;
/* write a program to print area of 2 rectangle having side 4,5 and 5,8 and parameter
 * class by creating a 'rectangle' 
 * with a method name "Area" which returns area and lemght & breadth passed as parameter to its constructor
 * */
class Rectangle{
	//instance variable
	int lenght; 
	int breadth;
	
	//creating constructor
	public Rectangle(int lenght, int breadth) {
		this.lenght = lenght;
		this.breadth = breadth;
	}

	
	 void Area() {
	    //this.lenght=lenght;
		//this.breadth=breadth;
		System.out.println("Area of Rectangle is "+ lenght*breadth);
		System.out.println("Perimeter of Rectangle is "+ 2*(lenght+breadth));
	 }
	 
	 Rectangle(){
		 System.out.println("Rectangle");
	 }
		
	
}
public class xyz {
	public static void main(String[] args) {
		//creating object using new keyword
		Rectangle r = new Rectangle();
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(6,8);
		r1.Area();
		r2.Area();

		

		//r.lenght=4;
		//r.breadth=5;
		//Rectangle r1 = new Rectangle();
		//r1.lenght=6;
		//r1.breadth=8;
		//r.Area();
		//r1.Area();
		
	}

}
