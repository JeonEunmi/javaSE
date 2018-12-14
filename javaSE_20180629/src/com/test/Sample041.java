package com.test;

public class Sample041 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 수를 합산하고 그 결과를 도출한다.
		// 1 + 2 + 3 + ... + 100 = 5050
		
		// 초기화 위치에 따라 결과값이 달라질 수 있으므로 주의한다.
		int result = 0; 
		
		for (int a = 1; a <= 100; ++a) {
			//System.out.println(a);
			result += a;
			}
		System.out.println(result);

	}

}
