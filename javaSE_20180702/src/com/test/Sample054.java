package com.test;

public class Sample054 {

	public static void main(String[] args) {

		// 중첩 for문을 이용한 숫자 출력
		/*
		  1  2  3  4  5  6  7  8  9 10
		  2  3  4  5  6  7  8  9 10 11
		  3  4  5  6  7  8  9 10 11 12
		  4  5  6  7  8  9 10 11 12 13
		  5  6  7  8  9 10 11 12 13 14
		  6  7  8  9 10 11 12 13 14 15
		  7  8  9 10 11 12 13 14 15 16
		  8  9 10 11 12 13 14 15 16 17
		  9 10 11 12 13 14 15 16 17 18
		 10 11 12 13 14 15 16 17 18 19

		 */
		for (int a = 1; a <= 10; ++a) {
			for (int b = a; b <= a + 9; ++b) {
				System.out.printf("%3d",b);
			}
			System.out.println();
		}
	}

}
