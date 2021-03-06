package com.test;

import java.util.Arrays;

public class Sample110 {

	public static void main(String[] args) {
		
		// 문제)
		// 2차원 배열의 요소 크기가 일정 (3,4,5 등) 다양하다고 가정할때,
		// 랜덤한 길이(10~ 20)의 1차원 배열 요소 (1부터 순차적으로)를 2차원 배열로 변환
		/*
		count = 4
		-----------
		[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
		-----------
		[1, 2, 3, 4]
		[5, 6, 7, 8]
		[9, 10, 11, 12]
		*/
		int count = 5;
		System.out.println("count : " + count);
		
		int tmp = 0;
		
		do {										// tmp : count값에 맞게 나누어줄 수
			tmp = (int)(Math.random()*11)+10;		// tmp값이 count의 배수가 아니면 계속 추출
		}while(tmp%count != 0);                     // 배수면 do-while문을 벗어난다
		
		System.out.println("count의 배수 : " + tmp);
		System.out.println("-------------");
				
		int[] a = new int[tmp];						// 길이 tmp만큼의 배열 a 생성
		
		for(int i=0; i<a.length; ++i) {				// 1에서 tmp 까지의 수를 순차적으로 배열 a에 넣음
			a[i] = i+1;
		} 
		
		System.out.println(Arrays.toString(a));
		System.out.println("-------------");
		int count2 = a.length / count;				// count2 -> 행 갯수 (전체길이 / 한줄에 들어가는 갯수)
		int[][] b = new int [count2][];				// count2 행 만큼의 다차원 배열 b 생성
		
		for(int i =0; i<b.length; ++i) {
			b[i] = Arrays.copyOfRange(a, i*count, i*count+count); 	// 배열 b에 count 만큼 쪼개어 넣음
		}

		for(int i=0; i<b.length; ++i) {
		System.out.println(Arrays.toString(b[i]));		// 생성된 배열 b를 프린트
		}
	}

}
