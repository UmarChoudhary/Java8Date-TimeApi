package com.date_Time;

import java.time.LocalDateTime;

public class Time_Date {
	public static void main(String[] args) {
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		int d=dt.getDayOfMonth();
		int m=dt.getMonthValue();
		int y=dt.getYear();
		System.out.println("Date: "+d+"-"+m+"-"+y);
		int h=dt.getHour();
		int m1=dt.getMinute();
		int s=dt.getSecond();
		int n=dt.getNano();
		System.out.println("Time: "+h+":"+m1+":"+s+":"+n);
	}
}