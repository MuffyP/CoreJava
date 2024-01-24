package com.edubridge.selectionstatment;

import java.util.Scanner;

public class SwitchStatment {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int map_no=s.nextInt();
		switch(map_no) {
		case 1:
			System.out.println("Wellcome to erangle:");
			break;
		case 2:
			System.out.println("Wellcome to Miramar");
			break;
		case 3:
			System.out.println("Wellcome to Vikendi");
			break;
		case 4:
			System.out.println("Wellcome to Sanhok");
			break;
		default:
			System.out.println("Invalid map no");
		
		
		}
	}

}
