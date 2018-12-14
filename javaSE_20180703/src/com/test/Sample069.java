package com.test;

public class Sample069 {

	public static void main(String[] args) {
		// String 클래스 ( 참조 자료형 )
		// replace() 메소드
		// -> 특정 문자열을 가지고 주어진 문자열 내에서 기존 문자열을 새로운 문자열로 치환
		// 주의) 문자열 치환 결과는 새로운 문자열 객체이다.
				
		String a = "This method returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.";
		String b = "string";
		String c = "test";
		
		System.out.println(a.replace(b,c));

	}

}
