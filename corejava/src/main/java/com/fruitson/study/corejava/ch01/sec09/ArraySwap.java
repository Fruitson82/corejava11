package com.fruitson.study.corejava.ch01.sec09;

public class ArraySwap {

	public static void main(String[] args) {
		
		int[] values = {1, 2, 3, 4, 5};
		System.out.println("===========");
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		swap(values, 3, 2);
		System.out.println("===========");
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}
		
		System.out.println(average(5, 10, 22, 2525151d));
	}
	
	public static void swap(int[] values, int i, int j) {
		int temp = values[j];
		values[j] = values[i];
		values[i] = temp;
	}
	
	public static double average(double... values) {
		
		double sum = 0;
		for(double v: values) {
			sum += v;
		}
		
		return values.length == 0 ? 0 : sum/values.length;
	}
	
}
