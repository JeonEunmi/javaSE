package com.test;

public class Sample108 {

	public static void main(String[] args) {

		// n차원 배열 탐색 및 연산
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		
		//문제)
		//배열 안에 있는 요소의 합을 연산하고 결과 출력
		
		int sum = 0;
		
		System.out.println("일반 for문 사용");
		for(int i=0; i<a.length; ++i) {   
			for(int j=0; j<a[i].length; ++j) {
				sum += a[i][j];
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("--------");
		System.out.println(sum);
		System.out.println();
		
		System.out.println("향상된 for문 사용");
		int total = 0;
		
		for(int[] i : a) {
			for(int j : i) {
				total += j;
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("--------");
		System.out.println(total);
		
	}

}
