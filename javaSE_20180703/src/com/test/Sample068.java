package com.test;

public class Sample068 {

	public static void main(String[] args) {
		// String 클래스 ( 참조 자료형 )
		// indexOf() 메소드
		// -> 특정 문자열이 주어진 문자열 내에 존재하는지 검색
		// 존재하는 경우 인덱스(0이상) 반환, 없는 경우 -1 반환
		
		String a = "This method returns the index within this string of the first occurrence of the specified substring. If it does not occur as a substring, -1 is returned.";
		String b = "string";
		String c = "test";
		
		System.out.println(a.indexOf(b));
		System.out.println(a.indexOf(c));
				

	}

}
