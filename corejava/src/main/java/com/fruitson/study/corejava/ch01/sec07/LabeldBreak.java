package com.fruitson.study.corejava.ch01.sec07;

public class LabeldBreak {

	public static void main(String[] args) {
		
		outer:
		while(true) {
			System.out.println("------------------");
			for(int i=0; i<10; i++) {
				System.out.println(i);
				if(i == 5) {
					break outer;
				}
			}
		}
		String[] authors = {
			"aa",
		};
	}
	
	
}
