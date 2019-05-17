package com.fruitson.study.corejava.ch03.sec02;

public class Employee implements Identified, Person{
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getid() {
		// TODO Auto-generated method stub
		return Identified.super.getid();
	}
	
	
	
}
