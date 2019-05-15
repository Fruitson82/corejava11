package com.fruitson.study.corejava.ch01.sec02;

public class Console {

	
	public static void main(String[] args) {
		
		java.io.Console terminal = System.console();
		String username = terminal.readLine("User name: ");
		char[] passwd = terminal.readPassword("Password: ");
		
		System.out.println("=========================");
		System.out.println(username);
		System.out.println(passwd);
		
	}
}
