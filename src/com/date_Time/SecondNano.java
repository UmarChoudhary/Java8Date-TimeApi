package com.date_Time;

import java.time.LocalTime;

public class SecondNano {
	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		
		int h = time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		System.out.println(h+"-"+m+"-"+s+"-"+n);
	}
}
