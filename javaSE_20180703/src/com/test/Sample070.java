package com.test;

public class Sample070 {

	public static void main(String[] args) {
		// String 클래스 (참조 자료형)
		// substring() 메소드
		// -> 주어진 문자열에서 부분 문자열 추출.
		// 주의) 추출된 부분 문자열은 새로운 문자열 객체이다.
		
		String ssn = "990624-1234567";
		
		// 주민번호(년월일-성별...)에서 생년월일 추출
		
		// String substring(int beginIndex(inclusive), int endIndex(exclusive))
		System.out.println(ssn.substring(0,6));
		
		// String substring(int beginIndex)
		System.out.println(ssn.substring(7));

	}

}
