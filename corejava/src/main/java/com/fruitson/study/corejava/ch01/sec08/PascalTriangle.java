package com.fruitson.study.corejava.ch01.sec08;

import java.util.Arrays;

public class PascalTriangle {

	public static void main(String[] args) {
		
		
		int n = 5;
		int[][] triangle = new int[n][0];
		
		for(int i=0; i<5; i++) {
			triangle[i] = new int[i + 1];
			triangle[i][0] = 1;
			triangle[i][i] = 1;
			
			for(int j=1; j<i; j++) {
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
			}
		}
		
		for(int r=0; r<triangle.length; r++) {
			for(int c=0; c<triangle[r].length; c++) {
				System.out.printf("%4d", triangle[r][c]);
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		for(int[] row: triangle) {
			for(int element: row) {
				System.out.printf("%4d", element);
			}
			System.out.println();
		}
		
		System.out.println("===============================");
		
		System.out.println(Arrays.deepToString(triangle));
	}
	
	
}
