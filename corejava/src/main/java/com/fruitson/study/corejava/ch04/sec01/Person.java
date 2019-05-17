package com.fruitson.study.corejava.ch04.sec01;

public abstract class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public abstract int getId();
	
}
