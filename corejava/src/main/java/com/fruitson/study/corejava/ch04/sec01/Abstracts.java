package com.fruitson.study.corejava.ch04.sec01;

public class Abstracts {
	
	public static void main(String[] args) {
		
		Person person = new Student("Fred", 111);
		Student student = new Student("July", 5522);
		
		System.out.println(person.getName());
		System.out.println(student.getName2());
		
		System.out.println(person.toString());
		System.out.println(student.toString());
		
	}
	
	
	
}
