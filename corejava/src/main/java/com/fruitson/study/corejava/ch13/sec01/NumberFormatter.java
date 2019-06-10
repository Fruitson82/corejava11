package com.fruitson.study.corejava.ch13.sec01;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatter {

	public static void main(String[] args) throws ParseException {
		
		Locale loc = Locale.GERMANY;
		NumberFormat formatter = NumberFormat.getCurrencyInstance(loc);
		
		double amt = 123456.78;
		String result = formatter.format(amt);
		
		System.out.println(result);

		NumberFormat formatter2 = NumberFormat.getNumberInstance();
		Number parsed = formatter2.parse(result);
		
		double x = parsed.doubleValue();
		
		System.out.println(x);
		
	}
	
	
}
