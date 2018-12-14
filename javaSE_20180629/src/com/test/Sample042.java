package com.test;

public class Sample042 {

	public static void main(String[] args) {
		// 1부터 100까지의 수를 합산하고 그 결과를 출력
		
		/*
		 * 1 2 3 4 5 6 7 8 9 10
		 * 11 12 13 14 15 16 17 18 19 20
		 * ...
		 * 91 92 93 94 95 96 97 98 99 100
		 * -------------------------------
		 * 5050
		 */
		int result = 0;
		for(int i = 1; i<=100; ++i) {
			result += i;
			System.out.print(i + " ");
			if(i%10 == 0) {
				System.out.println();
			}
		}
		System.out.println("-----------------------------");
		System.out.println(result);

		}
	}

