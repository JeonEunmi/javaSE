package com.test;

public class Sample055 {

	public static void main(String[] args) {
		// 중첩 for문을 이용한 숫자 출력
		
		for (int a = 1; a <= 10 ; ++a) {
			for (int b = 1; b <= 10 - a; ++b) {
				System.out.print("   ");
			}
			for(int b = 1; b <= a; ++b) {
				System.out.printf("%3d",b);
			}
			System.out.println();
		}

		}

	}
