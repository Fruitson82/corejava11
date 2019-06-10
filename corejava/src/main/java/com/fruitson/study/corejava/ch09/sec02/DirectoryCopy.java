package com.fruitson.study.corejava.ch09.sec02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 09.02. 자바 입출력 - 디렉토리 복사
 * 	
 * @author Fruitson
 * @since 2019.05.27
 */
public class DirectoryCopy {

	public static void main(String[] args) throws IOException {
		
		Path source = Paths.get("D:\\development\\php");
		Path target = Paths.get("D:\\development\\temp");
		
		Files.walk(source).forEach(p -> { 
			try {
				Path q = target.resolve(source.relativize(p));
				if(Files.isDirectory(p)) {
					Files.createDirectories(q);
					System.out.println(q + "is created...");
				}else {
					Files.copy(p, q);
					System.out.println(q + "is copied...");
				}
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		});
	}
	
	
}
