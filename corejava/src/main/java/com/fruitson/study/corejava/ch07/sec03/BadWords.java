package com.fruitson.study.corejava.ch07.sec03;

import java.util.HashSet;
import java.util.Set;

/**
 * 07.03. 컬렉션 - 집합(Set)
 * 	나쁜단어 set 체크
 * 
 * @author Fruitson
 * @since 2019.05.22
 */
public class BadWords {
	
	public static void main(String[] args) {
		BadWords badWords = new BadWords();
		System.out.println(badWords.checkBadWords("sex"));
	}
	
	boolean checkBadWords(String userName) {
		
		Set<String> badWords = new HashSet<>();
		badWords.add("sex");
		badWords.add("drugs");
		badWords.add("c++");
		if(badWords.contains(userName.toLowerCase())) {
			System.out.println("Please choose a different user name.");
			return false;
		}
		
		return true;
	}
	
}
