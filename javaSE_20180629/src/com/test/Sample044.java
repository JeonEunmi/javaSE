package com.test;

public class Sample044 {

	public static void main(String[] args) {
		// 1부터 100까지의 수를 합산하고 그 결과를 출력
		
		/*
		 * 실행예)
		 * 1 + 2 + 3 + ... + 100 = 5050
		 */
		
		
		int result = 0;
		
		for(int i=1; i<=100; ++i) {
			if(i < 100) {
				System.out.print(i + " + ");
			} else
				System.out.print(i + " = ");
			result += i;
		}
		System.out.println(result);
	}

}
