package com.fruitson.study.corejava.ch12.sec01;

import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class Duration {
	
	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		Thread.sleep(3000);
		Instant end = Instant.now();
		
		java.time.Duration timeElapsed = java.time.Duration.between(start, end);
		
		long millis = timeElapsed.toSeconds();
		
		System.out.println(millis);
		
		
		
	}
	
}
