package com.fruitson.study.corejava.ch01.sec08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHandle {

	public static void main(String[] args) {
		
		ArrayList<String> friends = new ArrayList<>(List.of("Peter", "Paul"));
		friends.add("aaa");
		
		List<String> temp = List.of("aa", "affas");
		//temp.add("bb"); // UnsupportedOperationException 에러 발생. List.of는 불변의 List를 반환
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		
		System.out.println(numbers.get(0).equals(numbers.get(1)));
		
		
	}
	
}
