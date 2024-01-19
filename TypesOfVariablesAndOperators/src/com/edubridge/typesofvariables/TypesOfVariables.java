package com.edubridge.typesofvariables;
//program to
public class TypesOfVariables {
	//instance variable
	float salary = 73998.56f;
	//static variable
	static int x=10;
	
	String display()
	{
		//local variable
		char res='z';
		System.out.println(res);
		return "Local Variable";
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		//obj creation
		TypesOfVariables obj=new TypesOfVariables();
		System.out.println(obj.display());
		System.out.println(obj.salary);

		
	}

}
