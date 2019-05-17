package com.fruitson.study.corejava.ch02;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateCheck {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2019, 5, 1);
		while(date.getMonthValue() == 5) {
			System.out.printf("%4d", date.getDayOfMonth());
			date = date.plusDays(1);
		}
		
		System.out.println("====");
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();
		for(int i=0; i<value; i++) {
			System.out.println("    ");
		}
	}
	
	
	
}
