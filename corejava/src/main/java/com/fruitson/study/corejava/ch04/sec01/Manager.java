package com.fruitson.study.corejava.ch04.sec01;

public class Manager extends Employee {

	private double bonus;
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getSalary() {
		return salary + bonus;
	}
	
	public Manager(String name, double salary) {
		super(name, salary);
		this.bonus = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[bonus=" + bonus + "]";
	}
}
