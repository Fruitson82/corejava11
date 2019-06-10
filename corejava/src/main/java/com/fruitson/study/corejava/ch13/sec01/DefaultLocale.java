package com.fruitson.study.corejava.ch13.sec01;

import java.util.Locale;

public class DefaultLocale {
	
	public static void main(String[] args) {
		
		Locale displayLocale = Locale.getDefault(Locale.Category.DISPLAY);
		Locale formatLocale  = Locale.getDefault(Locale.Category.FORMAT);
		
		System.out.println(displayLocale.getDisplayLanguage());
		System.out.println(formatLocale.getLanguage());
		
		String cmd = "QUIT".toLowerCase(Locale.forLanguageTag("tr"));
		System.out.println(cmd);
		
	}
	
	
}
