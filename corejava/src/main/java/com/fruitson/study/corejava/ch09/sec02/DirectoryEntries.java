package com.fruitson.study.corejava.ch09.sec02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 09.02. 자바 입출력 - 디렉토리 조회
 * 	
 * @author Fruitson
 * @since 2019.05.27
 */
public class DirectoryEntries {
	
	public static void main(String[] args) {
		
		String pathToDirectory = "D:\\downloads\\torrent\\complete\\새 폴더";
		
		// 해당 경로에 속한 디렉토리만 조회
		try(Stream<Path> entries = Files.list(Paths.get(pathToDirectory))) {
			entries.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 해당 경로의 서브 자손까지 모두 조회
		try(Stream<Path> entries = Files.walk(Paths.get(pathToDirectory))) {
			entries.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
