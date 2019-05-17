package com.fruitson.study.corejava.ch03.sec02;

public interface Identified {
	
	default int getid() { return Math.abs(hashCode()); }
}
