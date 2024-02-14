package com.edubridge.DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalZoneDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime d=  ZonedDateTime.now();
		System.out.println("The Current date,time,zone: "+d);
		
		OffsetTime o=  OffsetTime.now();
		System.out.println("The offset time,zone: "+o);
		
		OffsetDateTime o1=  OffsetDateTime.now();
		System.out.println("The offset time,zone: "+o1);
		
		ZoneId i =ZoneId.of("Asia/Calcutta");
		System.out.println(i);
		
		ZoneOffset o2=  ZoneOffset.UTC;
		System.out.println("The offset time,zone: "+o2);
		
		ZoneOffset o3=  ZoneOffset.ofHoursMinutes(2, 35);
		System.out.println("The offset time,zone: "+o3);
		
		String str = "2020-12-04 12:30";
		DateTimeFormatter o5= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime o4= LocalDateTime.parse(str, o5);
		System.out.println(o4);
		
	}

}
