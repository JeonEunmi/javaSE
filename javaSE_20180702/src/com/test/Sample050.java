package com.test;

public class Sample050 {
	public static void main(String[] args) {
		
		// 중첩 for문
		/*
		 * for(initialization; Boolean_expression; update) {
   			// Statements
   			for(initialization; Boolean_expression; update) {
   				// Statements
				}
			}
		 */
		
		// 중첩 for문은 바깥쪽 for문의 변수와 안쪽 for문의 변수 이름은 다르게 지정한다.
		
		// 안쪽의 문장을 10번 반복
		// 1부터 10까지의 수를 출력
		for (int a = 1; a <= 10; ++a) {
			for (int b = 1; b <= 10; ++b) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		
		for (int a = 1; a <= 10; ++a) {
			// 특정수부터 10까지의 수를 출력
			for (int b = a; b <= 10; ++b) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
