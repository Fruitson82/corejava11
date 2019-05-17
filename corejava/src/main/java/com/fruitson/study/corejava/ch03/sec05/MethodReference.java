package com.fruitson.study.corejava.ch03.sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MethodReference {

	public static void main(String[] args) {
		
		String[] strings = new String[] { "c", "a", "B", "E", "d" };
		System.out.println(Arrays.toString(strings));
		//Arrays.sort(strings, (x, y) -> x.compareToIgnoreCase(y));
		Arrays.sort(strings, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(strings));
		
		ArrayList<String> list = new ArrayList<>();
		list.add(null);
		list.add("A");
		list.add(null);
		list.add("B");
		list.add("C");
		
		System.out.println(list);
		list.removeIf(Objects::isNull);
		System.out.println(list);
		list.forEach(System.out::println);
		
	}
	
}
