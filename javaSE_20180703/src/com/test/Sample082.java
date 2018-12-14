package com.test;

import java.util.Arrays;

public class Sample082 {

	public static void main(String[] args) {
		
		// 문제)
		// 배열 요소 탐색 및 연산
		
		// 5개의 정수 자료를 저장하는 배열 선언
		
		// 임의의 정수를 채운다.
		
		// 배열에 채워진 정수 자료 중에서 가장 큰 값, 가장 작은 값을 분석
		
		// 결과 출력
		// -> 배열 요소 전체, 가장 큰 값, 가장 작은 값
		
		int [] num = new int[5];
		
		for(int i=0; i<num.length; ++i) {
			num[i] = (int)(Math.random()*101);
		}
		
		int max = 0;
		int min = num[0];
		
		for(int i=0; i<num.length; ++i) {
			if(max < num[i]) {
				max = num[i];
			} else if (min > num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println("배열의 최대값 : " + max);
		System.out.println("배열의 최소값 : " + min);

	}

}
