package com.fruitson.study.corejava.ch03.sec02;

public interface Person {
	
	String getName();
	default int getId() { return 0; }
	
}
