package com.fruitson.study.corejava.ch04.sec01;

public class Extends {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager("Manager", 10000);
		manager.setBonus(50000);
		
		Employee empl = manager;
		
		Employee empl2 = new Employee("Employee", 5000);
		
		System.out.println(empl2.toString());
		System.out.println(empl.toString());
		System.out.println(manager.toString());
		
		
	}
	
}
