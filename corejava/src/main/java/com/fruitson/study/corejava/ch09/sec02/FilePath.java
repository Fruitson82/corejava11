package com.fruitson.study.corejava.ch09.sec02;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 09.02. 자바 입출력 - 경로(Path)
 * 	경로 확인
 * 
 * @author Fruitson
 * @since 2019.05.24
 */
public class FilePath {
	
	public static void main(String[] args) {
		
		Path p = Paths.get("D:\\downloads", "task2_1.png", "task2_2.png");
		
		Path parent = p.getParent();	// 경로 D:\
		System.out.println(parent.toString());
		
		Path file = p.getFileName();	// 마지막 요소
		System.out.println(file);
		
		Path root = p.getRoot();		// 시작 세그먼트인 D:\
		System.out.println(root);
		
		Path first = p.getName(0);		// 첫번째 요소 Name
		System.out.println(first);
		
		Path dir = p.subpath(1, p.getNameCount()); 	// 첫번째 요소를 제외한 모든 요소
		System.out.println(dir);
		
	}
	
	
}
