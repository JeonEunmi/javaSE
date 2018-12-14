package com.test;

public class Sample008 {
	
	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		// 1-(7 * 0.1) = ??
		double result = apple - (number *pieceUnit);
		
		System.out.println(result); //(0.3 --> 0.299999999993)
	}
}
