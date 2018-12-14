package com.test;

import java.util.Arrays;

public class Sample106 {

	public static void main(String[] args) {
		
		// 다차원 배열 (배열의 배열)
		
		// 1차원 배열
		int[] a = {10, 20, 30};
		System.out.println(Arrays.toString(a));
		
		// n차원 배열 (배열의 배열)
		int[][] b = new int[2][3];  //고정된 상태
		
		// 주의 사항, Arrays.toString() 메소드는 1차원 배열만 출력 가능
		System.out.println(Arrays.toString(b)); 
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));
		
		// n차원 배열(배열의 배열) 
		int[][] c = new int [2][];  //가변적상태;
		c[0] = new int[2];
		c[1] = new int[3];
				
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c[0]));
		System.out.println(Arrays.toString(c[1]));
				
		//n차원 배열 (배열의 배열)
		int[][] d = {{1,2}, {3,4}, {5,6,7}};
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(d[0]));
		System.out.println(Arrays.toString(d[1]));
		System.out.println(Arrays.toString(d[2]));
		
		//length field는 배열의 요소 갯수를 반환. 단, 1차원적
		System.out.println(d.length);
		System.out.println(d[0].length);
		System.out.println(d[2].length);
		}
	} 

