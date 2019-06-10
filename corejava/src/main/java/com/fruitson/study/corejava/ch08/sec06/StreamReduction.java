package com.fruitson.study.corejava.ch08.sec06;

import static java.nio.file.Paths.get;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReduction {

	public static void main(String[] args) throws IOException {
		
		String contents = new String(Files.readAllBytes(
				get("temp/alice.txt")), StandardCharsets.UTF_8); // 파일을 문자열로 읽어온다.
		
		Stream<String> words = Stream.of(contents.split("\\PL+"));
		Optional<String> largest = words.max(String::compareToIgnoreCase);
		System.out.println("largest: " + largest.orElse(""));
		
		words = Stream.of(contents.split("\\PL+")); // Stream은 오직 한번만 사용 가능.
		Optional<String> startWithb
			= words.filter(s -> s.startsWith("b")).findFirst();
		
		System.out.println("find first b: " + startWithb.isPresent());
		
	}
	
	
	
}
