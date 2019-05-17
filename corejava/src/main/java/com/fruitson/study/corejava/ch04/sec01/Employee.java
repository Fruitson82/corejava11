package com.fruitson.study.corejava.ch04.sec01;

public class Employee {
	
	private String name;
	protected double salary;
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return getClass().getName() + "[name=" + name + ", salary=" + salary + "]";
	}
}
