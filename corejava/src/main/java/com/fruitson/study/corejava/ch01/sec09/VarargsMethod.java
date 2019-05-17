package com.fruitson.study.corejava.ch01.sec09;

public class VarargsMethod {
	
	public static void main(String[] args) {
		System.out.println(average(3, 4.5, -5, 0));
		System.out.println(average(new double[] {3, 4.5, -5, 0}));
	}

	private static double average(double ... values) {
		double sum = 0;
		for(double v: values) {
			sum += v;
		}
		return values.length == 0 ? 0 : sum / values.length;
	}
	
	
}
