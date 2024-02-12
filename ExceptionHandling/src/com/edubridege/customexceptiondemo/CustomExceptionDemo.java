package com.edubridege.customexceptiondemo;

import java.util.Scanner;

// main folder of customexception
public class CustomExceptionDemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String emailId= s.nextLine();
		String password= s.next();
		
		try {
			if(emailId.equals("muffy@gmail.com")&& password.equals("Muffy123")) {
				System.out.println("Logged in Succesfully");
			}
			else {
				throw new LoginCredentials("Invalid Credentials");
			}
			
		}
		catch(LoginCredentials e){
			System.out.println(e);
			}
	}

}
