package com.fruitson.study.corejava.ch05.sec01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;

/**
 * 05.01. 예외 처리
 * 
 * @author Fruitson
 * @since 2019.05.17
 */
public class Exceptions {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter("output.txt");
		try(out) {
			out.println("a");
		}
		
		String str = null;
		Objects.requireNonNull(str, "not null?");
	}
	
}
