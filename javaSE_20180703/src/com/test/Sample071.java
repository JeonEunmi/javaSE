package com.test;

public class Sample071 {

	public static void main(String[] args) {
		// String 클래스 (참조 자료형)
		// toUpperCase(), toLowerCasae() 메소드
		// -> 모든 문자를 대문자, 소문자로 변환
		// 주의) 변환된 문자열은 새로운 문자열 객체이다.
		
		String a = "This method has two variants and returns a new string that is a substring of this string.";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a);
	}

}
