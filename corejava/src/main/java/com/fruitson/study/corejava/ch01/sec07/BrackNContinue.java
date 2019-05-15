package com.fruitson.study.corejava.ch01.sec07;

public class BrackNContinue {

	public static void main(String[] args) {
		
		System.out.println("[Break] ==========================");
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("[Continue] ==========================");
		
		for(int i=0; i<10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
	
}
