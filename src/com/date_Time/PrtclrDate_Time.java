package com.date_Time;

import java.time.LocalDateTime;
import java.time.Month;

public class PrtclrDate_Time {
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.of(1947,Month.MAY,28,12,45);
		System.out.println(dt);
	}
}