package com.fruitson.study.corejava.ch08.sec01;

import static java.nio.file.Paths.get;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class StreamByFile {
	
	public static void main(String[] args) throws IOException {
		
		String contents = new String(Files.readAllBytes(
				get("temp/alice.txt")), StandardCharsets.UTF_8); // 파일을 문자열로 읽어온다.
		
		// 단어로 분리한다(비문자(글자가 아닌 문자)를 구분자로 사용한다).
		List<String> words = List.of(contents.split("\\PL+"));
		
		int count = 0;
		for(String w: words) {
			if(w.length() > 6) count++;
		}
		
		long count2 = words.stream()
				.filter(w -> w.length() > 6)
				.count();
		
		
		System.out.println(count);
		System.out.println(count2);
		
	}
	
}
