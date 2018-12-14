package com.test;

public class Sample107 {

	public static void main(String[] args) {

		// n차원 배열 탐색 및 연산
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };

		// 특정 요소 탐색시 [인덱스1][인덱스2]
		// [인덱스1] : 행 , [인덱스2] : 열
		System.out.println(a[0][0]); // 1
		System.out.println(a[2][3]); // 10

		// n차원 배열 요소 탐색시 중첩 for문 사용
		for (int b = 0; b < a.length; ++b) {
			System.out.println(a[b]); // 배열 객체의 참조주소
		}

		for (int b = 0; b < a.length; ++b) {
			for (int c = 0; c < a[b].length; ++c) {
				System.out.print(a[b][c]+ " "); //a[0][0], a[0][1], a[0][2]....
			}
		}
		System.out.println(" ");
		
		// n차원 배열 요소 탐색시 중첩 Enhanced for문 사용
		for (int[] b : a) {
			for(int c : b) {
				System.out.print(c + " ");
			}
		}
	}

}
