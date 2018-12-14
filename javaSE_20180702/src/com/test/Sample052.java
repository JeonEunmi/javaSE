package com.test;

public class Sample052 {

	public static void main(String[] args) {
		// 구구단 전체(1단 ~ 9단)를 출력하는 중첩 for문
		
		/*
		 * 실행예)
		 * 1 * 1 = 1  1 * 2 = 2  1 * 3 = 3
		 * 1 * 4 = 4  1 * 5 = 5  1 * 6 = 6
		 * 1 * 7 = 7  1 * 8 = 8  1 * 9 = 9
		 * 
		 * 2 * 1 = 2  2 * 2 = 4  2 * 3 = 6
		 */
		
		
		for(int i = 1; i < 10; ++i) {
			for(int j = 1; j < 10; ++j) {
				System.out.print(i + " * " + j + " = " + (i * j) + "\t");
				
				if(j % 3 == 0)
					System.out.println();
			}
			System.out.println();
		}

	}

}
