package com.fruitson.study.corejava.ch02.sec02;

public class Employee {

	private String name;
	private double salary;
	
	public void raiseSalary(double byPercent) {
		double raise = this.salary * byPercent / 100;
		this.salary += raise;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.getSalary();
	}
}
