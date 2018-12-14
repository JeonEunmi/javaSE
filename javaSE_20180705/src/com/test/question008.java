package com.test;

public class question008 {

	public static void main(String[] args) {
		
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		
		int sum = 0;
		int count = 0;
		
		for (int[] b : a) {
			for (int c : b) {
				sum += c;
				++count;
				System.out.println(c + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		System.out.println(sum);
		System.out.println(sum /(double)count);
	
	}
	

}
 