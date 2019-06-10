package com.fruitson.study.corejava.ch09.sec02;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 09.02. 자바 입출력 - ZIP 파일 시스템
 * 	
 * @author Fruitson
 * @since 2019.05.27
 */
public class ZipFile {

	public static void main(String[] args) throws IOException {
		String zipName = "D:\\development\\temp\\framework-4.0.0-beta.2.zip";
		FileSystem zipfs = FileSystems.newFileSystem(Paths.get(zipName), null);
		Files.walk(zipfs.getPath("/")).forEach(System.out::println);
	}
	
}
