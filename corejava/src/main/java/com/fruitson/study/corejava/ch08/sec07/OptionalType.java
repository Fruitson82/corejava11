package com.fruitson.study.corejava.ch08.sec07;

import java.util.Optional;

public class OptionalType {
	
	public static void main(String[] args) {
		
		OptionalType ot = new OptionalType();
	}
	
	
	public boolean isNull(Optional<?> obj) {
		return obj.isEmpty();
	}
	
}
