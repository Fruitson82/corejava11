package com.fruitson.study.corejava.ch01.sec08;

import java.math.BigInteger;

public class ArrayHandle {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {};
		System.out.println(numbers.length);
		
		BigInteger[] bigNumbers = new BigInteger[100];
		for(int i=0; i<100; i++) {
			bigNumbers[i] = BigInteger.valueOf(i);
		}
		
		numbers = new int[] {1, 2, 3, 4, 5};
		
	}
	
	
	
}
