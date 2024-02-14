package com.edubridge.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
//Program to demonstrate on LocalDate ,LocalTime & LocalDateTimes
public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate d= LocalDate.now();
		System.out.println("The Current date: "+d);
		
		LocalTime t = LocalTime.now();
		System.out.println("The Current time: "+t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("The Current date and time: "+dt);
	}

}
