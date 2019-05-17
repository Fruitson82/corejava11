package com.fruitson.study.corejava.ch04.sec02;

import java.util.Objects;

public class Item {

	private String description;
	private double price;
	
	@Override
	public boolean equals(Object otherObj) {
		
		// 두 객체가 동일한지 알아보는 빠른 검사
		if(this == otherObj) return true;
		
		// 매개변수가 null이면 false를 반환
		if(otherObj == null) return false;
		
		// otherObj가 Item의 인스턴스인지 검사
		if(getClass() != otherObj.getClass()) return false;
		
		// 인스턴스 변수들의 값이 동일한지 검사
		Item other = (Item) otherObj;
		return Objects.equals(description, other.description)
				&& price == other.price;
		
	}
	
	
}
