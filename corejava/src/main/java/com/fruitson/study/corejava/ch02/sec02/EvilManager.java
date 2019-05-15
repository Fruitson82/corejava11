package com.fruitson.study.corejava.ch02.sec02;

import java.util.Random;

public class EvilManager {

	private Random generator;
	
	public void giveRandomRaise(Employee e) {
		double percentage = 10 * generator.nextGaussian();
		e.raiseSalary(percentage);
	}
	
}
