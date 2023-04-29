package com.date_Time;

import java.time.LocalDate;

public class MonthYaer {
	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		System.out.println(l);
		
		int dd=l.getDayOfMonth();
		int mm=l.getMonthValue();
		int yyyy=l.getYear();
		
		System.out.println(dd+".."+mm+".."+yyyy);
		System.out.println(dd+"-"+mm+"-"+yyyy);
		System.out.printf("%d-%d-%d",dd,mm,yyyy);
	}
}