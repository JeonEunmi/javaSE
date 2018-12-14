package com.test;

public class Sample105 {

	public static void main(String[] args) {
		
		// 배열, 컬렉션 -> 향상된 for문 
		// 인덱스를 필요로 하지 않고 데이터만 가져오고 싶을 때 사용한다.
		
		int[] a = { 30, 40, 20, 50, 10 };

		int sum = 0;

		for (int b = 0; b < a.length; ++b) {
			sum += a[b];
		}
		
		System.out.println(sum);

		int[] c = { 30, 40, 20, 50, 10 };

		int total = 0;

		for (int b : c) {
			total += b;
		}
		
		System.out.println(total);
		

		/*
		 * for(자료형 변수 : 배열객체) {
			
		}
		 */
	}

}
