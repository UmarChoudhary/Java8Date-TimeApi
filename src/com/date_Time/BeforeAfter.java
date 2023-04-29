package com.date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class BeforeAfter {
	public static void main(String[] args) {
		LocalDateTime l=LocalDateTime.of(1800,Month.APRIL,28,12,45);
		System.out.println(l);
		
		System.out.println("After 6 month: "+l.plusMonths(6));
		System.out.println("Before 6 Month: "+l.minusMonths(6));
		
	}
}