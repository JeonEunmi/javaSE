package com.test;

import java.util.Arrays;

public class Sample093 {

	public static void main(String[] args) {
		
		//기본 자료형 배열과 참조 자료형 배열
		/*int[] a = new int[5];
		
		for(int b =0; b<a.length; ++b) {
			a[b] = (int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(a));
		*/
		
		//문제)
		//랜덤한 길이의 문자열을 동적 생성
		//byte 자료형의 배열 준비 -> 일정범위 (1~10)
		//byte 배열에 정수 난수를 저장 -> 일정한 범위(A ~ Z)
		//byte 배열을 문자열로 변환
		
		String[] c = new String[5];
		
		for(int d=0; d<c.length; ++d) {
			int num = (int)(Math.random()*10)+1;
			byte [] tmp1 = new byte [num];
		
			for(int i=0; i<tmp1.length; ++i) {
				tmp1[i] = (byte)((Math.random()* 26) + 65);			
				}
			
			c[d] = new String(tmp1);
		}
		
		System.out.println(Arrays.toString(c));
		
		

	}

}
