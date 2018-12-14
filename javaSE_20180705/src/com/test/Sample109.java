package com.test;

import java.util.Arrays;

public class Sample109 {

	public static void main(String[] args) {

		// 1차원 배열 -> 2차원 배열
		// 2차원 배열 -> 1차원 배열

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
//		int[][] b = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		
//		int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10 } };
		
		int[] t1 = Arrays.copyOfRange(a, 0, 5);
		int[] t2 = Arrays.copyOfRange(a, 5, 10);
		
		int[][] b = new int[2][];
		b[0] = t1;
		b[1] = t2;
		
		int count = 3;   // 나누어 떨어지게 하는 수, 나는 ~개씩 나오게 할거야! 
		int tmp = a.length / count;  //행길이는 원본배열에서 count만큼 끊었을때의 행 갯수 구하는 법
		int[][] c = new int[tmp][];   //tmp개의 행을 가진 배열 c를 생성
		
		for(int i=0; i<c.length; ++i) {
			c[i] = Arrays.copyOfRange(a, i*count, i*count+count);   //count만큼 끊어서 배열 복사
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));
		
		for(int i=0; i<c.length; ++i) {
			System.out.println(Arrays.toString(c[i]));   //다차원배열 c를 출력
		}
	}
}
