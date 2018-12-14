package com.test;

public class Sample046 {
	public static void main(String[] args) {
		
		// while, break 구문
		// 2개의 주사위 던지기
		// -> 2개의 주사위의 곱이 특정수(25)가 될 때 까지 반복 처리 
		/*
		 * 실행예)
		 * 1회 : (5, 6)
		 * 2회 : (2, 3)
		 * ...
		 * n회 : (5, 5)    -> 곱이 25가 될 때
		 * -------------- 프로그램종료
		 */
		
		int i = 1;
		
		while(true) {
			
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			int multiply = a*b;
			
			System.out.println(i+"회 : (" + a + ", " + b + ")");
			++i;
			if(multiply == 25)
				break;
		}
		System.out.println("-------------- 프로그램종료");
	}
}
