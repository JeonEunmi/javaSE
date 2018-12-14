package com.test;

import java.util.Arrays;

public class Sample114 {

	public static void main(String[] args) {
		
		// 2차원 배열 초기화
		// 2차원 배열(n * n)의 요소를 특정 숫자로 채운다.
		// 예를 들어, 달팽이 규칙, 홀수마방진 규칙(n값이 홀수인경우)
		
		/*
		 * 실행예)
		 * [1, 2, 3, 4, 5]
		 * [6, 7, 8, 9, 10]
		 * [11, 12, 13, 14, 15]
		 * [16, 17, 18, 19, 20]
		 * [21, 22, 23, 24, 25]
		 */
		
		// 배열 선언
		int[][] a = new int[5][5]; //정방행렬 new int[n][n];
		
		// 초기화 액션 진행
		int n = 0;
		for(int i=0; i<a.length; ++i) {
			for(int j=0; j<a[i].length; ++j) {
				a[(i%2==0) ? j : a[i].length-1-j][i] = ++n;
			}
		}
		/*
		 * a[j][i] = ++n;
		[1, 6, 11, 16, 21]
		[2, 7, 12, 17, 22]
		[3, 8, 13, 18, 23]
		[4, 9, 14, 19, 24]
		[5, 10, 15, 20, 25]
		
		a[i][j] = ++n;
		[1, 2, 3, 4, 5]
		[6, 7, 8, 9, 10]
		[11, 12, 13, 14, 15]
		[16, 17, 18, 19, 20]
		[21, 22, 23, 24, 25]
		*/
		// 출력 액션
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
		
	}

}
