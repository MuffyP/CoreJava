package com.edubridge.selectionstatment;

import java.util.Scanner;

public class IfAssignment {

	public static void main(String[] args) {
		        Object scanner;
		        Scanner S = new Scanner(System.in);
				int N = S.nextInt();
		        if (N%2==0){
		            if(2 >=N||N < 6)
		            {
		            System.out.println("Not Weird1");
		            }
		            if(6 <= N||N <= 20)
		            {
		            System.out.println("Weird1");
		            }
		            if(N>20){
		            System.out.println("Not Weird2");
		            }
		        }
		        else{
		            System.out.println("Weird2");
		        }
		        S.close();
		    }


	}


