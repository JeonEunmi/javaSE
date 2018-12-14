package com.test;

import java.util.Arrays;

public class Sample115 {

	public static void main(String[] args) {
		
		//문제)
		//2차원 배열 초기화
		//2차원 배열(n * n)의 요소를 특정 숫자로 채운다.
		//예를 들어, 달팽이, (홀수)마방진
		/* 
		실행예)
		[1, 2, 3, 4, 5]
		[16, 17, 18, 19, 6]
		[15, 24, 25, 20, 7]
		[14, 23, 22, 21, 8]
		[13, 12, 11, 10, 9]
		*/
		
		//배열 선언
		int[][] a = new int[5][5];
		int size = a.length;
		
		//초기화 액션
		int y = -1;
		int x = 0;
		int d = 1;
		int cnt = 0;

		while (size >= 0) {
			for (int i = 0; i < size; i++) {
				y = y + d;
				a[x][y] = ++cnt;
			}
			--size;
			for (int i = 0; i < size; i++) {
				x = x + d;
				a[x][y] = ++cnt;
			}
			d = -d;
		}
		
		//출력
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
		
	}

}
