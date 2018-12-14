package com.test;

public class Sample062 {

	public static void main(String[] args) {
		// 참조형 변수에서 == 연산
		
		String a = "TEST";
		
		String b = "HELLO";
		// 변수 b가 가지고 있는 참조주소를 변수 c에 할당
		String c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		// 참조형 변수에서 == 연산 수행시 참조주소를 비교한다.
		System.out.println(a == b);
		System.out.println(b == c);
	}

}
