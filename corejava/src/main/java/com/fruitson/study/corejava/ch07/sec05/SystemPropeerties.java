package com.fruitson.study.corejava.ch07.sec05;

import java.util.Properties;

/**
 * 07.05. 컬렉션 - 기타 컬렉션
 * 	System Properties
 * 
 * @author Fruitson
 * @since 2019.05.22
 */
public class SystemPropeerties {

	public static void main(String[] args) {
		
		Properties systemProps = System.getProperties();
		System.out.println("user.dir		: " + systemProps.getProperty("user.dir"));
		System.out.println("user.home		: " + systemProps.getProperty("user.home"));
		System.out.println("user.name		: " + systemProps.getProperty("user.name"));
		System.out.println("java.version	: " + systemProps.getProperty("java.version"));
		System.out.println("java.home		: " + systemProps.getProperty("java.home"));
		System.out.println("java.class.path	: " + systemProps.getProperty("java.class.path"));
		System.out.println("java.io.tmpdir	: " + systemProps.getProperty("java.io.tmpdir"));
		System.out.println("os.name			: " + systemProps.getProperty("os.name"));
		System.out.println("os.arch			: " + systemProps.getProperty("os.arch"));
		System.out.println("os.version		: " + systemProps.getProperty("os.version"));
		System.out.println("file.separator	: " + systemProps.getProperty("file.separator"));
		System.out.println("path.separator	: " + systemProps.getProperty("path.separator"));
		System.out.println("line.separator	: " + systemProps.getProperty("line.separator"));
	}
	
}
