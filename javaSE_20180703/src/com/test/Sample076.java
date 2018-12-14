package com.test;

import java.util.Arrays;

public class Sample076 {

	public static void main(String[] args) {

		// 배열 요소 탐색 및 연산
		// 배열에 임의의 정수를 채우고, 합산 연산 수행

		// 입력과정
		int[] num = new int[5];

		int sum = 0;
		double avg = 0.0;

		// 처리과정
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 101);
			sum += num[i];
		}
		
		avg = (double) sum / num.length;
		
		// 전체 요소 출력
		// 결과 출력
		System.out.println(Arrays.toString(num));
		System.out.println(sum);
		System.out.println(avg);
	}

}
