package com.fruitson.study.corejava.ch04.sec01;

public interface Named {
	
	default String getName() {
		return "Named";
	}
	
	default String getName2() {
		return "Named2";
	}
}
