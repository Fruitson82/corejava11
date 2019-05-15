package com.fruitson.study.corejava.ch01.sec02;

public class PrimitiveType {

	
	
	public static void main(String[] args) {
		
		System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int  : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		System.out.println(1000000);
		System.out.println(1_00_0000);
		
		int n = 42;
		String str = String.valueOf(n);
		String str2 = Integer.toString(n);
		
	}
	
	
}
