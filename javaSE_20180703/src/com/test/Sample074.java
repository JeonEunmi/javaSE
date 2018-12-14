package com.test;

import java.util.Arrays;

public class Sample074 {

	public static void main(String[] args) {

		// 배열 생성 및 초기화
		// 예를 들어, 1부터 5까지의 수를 배열에 저장

		// 인덱스 직접 지정
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(Arrays.toString(a));   // [1, 2, 3, 4, 5]

		// 반복문 이용해서 지정
		for (int i = 0; i < a.length; ++i) {
			a[i] = i + 11;

		}
		System.out.println(Arrays.toString(a));  // [11, 12, 13, 14, 15]
		
		
		// 생성 및 초기화 동시에  -> 값 목록에 의한 배열 생성
		int[] b = {21, 22, 23, 24, 25};
		System.out.println(Arrays.toString(b));  //[21, 22, 23, 24, 25]
	}

}
