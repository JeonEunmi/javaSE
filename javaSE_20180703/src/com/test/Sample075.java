package com.test;

import java.util.Arrays;

public class Sample075 {

	public static void main(String[] args) {
		// 크기 5인 배열을 준비하고 정수 난수(1~45)를 채운다.
		// 배열에 채워진 숫자들 중에서 가장 큰 수 출력

		int[] num = new int[5];

		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 45) + 1;
		}

		int tmp = num[0];

		for (int i = 0; i < num.length -1 ; ++i) {
			if (tmp < num[i+1]) {
				tmp = num[i+1];
			}
		}

		System.out.println("가장 큰 수는? : "+tmp);
		System.out.println(Arrays.toString(num));
	}

}
