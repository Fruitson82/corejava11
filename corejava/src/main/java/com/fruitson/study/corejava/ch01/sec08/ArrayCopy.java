package com.fruitson.study.corejava.ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] primes = new int[] {1, 2, 3, 4, 5};
		int[] numbers = primes;
		
		numbers[0] = 9;
		
		System.out.println(primes[0]);
		System.out.println(numbers[0]);
		
		int[] copiedPrimes = Arrays.copyOf(primes, primes.length);
		
		primes[0] = 99;
		
		System.out.println(primes[0]);
		System.out.println(numbers[0]);
		System.out.println(copiedPrimes[0]);
		
		String[] names = new String[] {"A", "B", "C"};
		ArrayList<String> friends = new ArrayList<>(List.of(names));
		
		String[] names2 = friends.toArray(new String[0]);
		
	}
	
}
