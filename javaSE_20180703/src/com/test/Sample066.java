package com.test;

public class Sample066 {

	public static void main(String[] args) {
		// String 클래스 (참조 자료형)
		// charAt() 메소드
		// --> 주어진 문자열의 특정 인덱스의 문자에 대한 char값
		// ex) 문자열 TEST -- 특정 인덱스(0)

		String a = "TEST";
		String b = new String("HELLO");

		// String (참조 자료형) -> char (기본 자료형)
		System.out.println(a.charAt(0)); // T
		System.out.println(a.charAt(1)); // E
		System.out.println(a.charAt(2)); // S
		System.out.println(a.charAt(3)); // T

		// char -> int
		System.out.println((int) a.charAt(0)); // 84
		System.out.println((int) a.charAt(1)); // 69
		System.out.println((int) a.charAt(2)); // 83
		System.out.println((int) a.charAt(3)); // 84

		// 인덱스 사용시 반복문 이용
		for (int c = 0; c < b.length(); ++c) {
			System.out.println(b.charAt(c));
		}

	}
}
