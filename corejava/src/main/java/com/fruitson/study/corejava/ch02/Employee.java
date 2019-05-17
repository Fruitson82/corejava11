package com.fruitson.study.corejava.ch02;

public class Employee {
	
	private static int lastId = 0;
	private int id;
	
	public Employee() {
		lastId++;
		id = lastId;
	}

	public int getId() {
		return id;
	}
}
