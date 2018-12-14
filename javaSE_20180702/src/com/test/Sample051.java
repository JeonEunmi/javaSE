package com.test;

public class Sample051 {

	public static void main(String[] args) {

		// 구구단 전체(1단~9단)를 출력하는 중첩 for문
		// 1단 -> 1 * 1 ~ 1 * 9
		// ...
		// 9단 -> 1 * 1 ~ 9 * 9
		
		// 랜덤한 i단의 구구단 출력
		/*
		int j = (int)(Math.random() * 9 ) + 1;
		for(int i = 1; i < 10; ++i) {
			System.out.println(j + " * " + i + " = " + (j * i));
		}
		*/
		
		
		for(int a = 1; a < 10; ++a) {
			for(int b = 1; b < 10; ++b) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
			System.out.println();
		}

	}

}
