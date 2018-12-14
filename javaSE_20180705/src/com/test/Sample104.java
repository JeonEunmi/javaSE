package com.test;

import java.util.Arrays;

public class Sample104 {

	public static void main(String[] args) {
		
		// 배열의 얕은 복사(shallow copy), 깊은 복사(deep copy)
		// -> 자료형이 참조형(String)인 배열
		
		// 얕은 복사 -> 배열 복사하는 경우 참조주소만 복사하는 경우
		// 깊은 복사 -> 배열 복사하는 경우 자료가 복사되는 경우 (메모리 상 데이터가 두개가 된다)
		
		// 자료형이 기본형인 경우 배열 복사하면 깊은 복사
		int[] a = {10, 20, 30};	
		int[] b = Arrays.copyOf(a, a.length + 5);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b)); 
		
		// 자료형이 참조형인 경우 배열 복사하면 얕은 복사
		String[] c = {"park", "hong", "lee"};
		String[] d = Arrays.copyOf(c, c.length + 5);
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
	}

}
