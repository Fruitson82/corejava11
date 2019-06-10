package com.fruitson.study.corejava.ch12.sec01;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateCheck {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate alonzosBirthday = LocalDate.of(1903, 6, 14);
		
		alonzosBirthday = LocalDate.of(1903, Month.JUNE, 14);
		
		System.out.println(today);
		System.out.println(alonzosBirthday);
		
	}
	
	
}
