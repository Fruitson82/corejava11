package com.fruitson.study.corejava.ch04.sec02;

import java.util.Objects;

public class ObjectMethod {
	
	public static void main(String[] args) {
		
		String a = "a";
		String b = null;
		
		System.out.println(Objects.equals(a, b));
		System.out.println(a.equals(b));
		
	}
	
	
}
