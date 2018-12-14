package com.test;

public class Sample064 {

	public static void main(String[] args) {
		
		// String 클래스 (참조 자료형)
		// - 문자열 취급시 사용하는 자료형
		
		// 동일한 문자열 리터럴 (불변의 특성)을 변수에 대입하는 경우
		String a = "TEST";
		String b = "TEST";
		System.out.println(a == b);
		
		// 새로운 문자열 객체를 준비하는 경우 new String
		String c = new String("HELLO");
		String d = new String("HELLO");
		// 참조주소 비교
		System.out.println(c == d);
		// 자료 비교 (대소문자도 구분함)
		System.out.println(c.equals(d));
		
		
		// 기본 자료가 연결된 참조형 변수에 null 할당
		// -> 기존 자료는 메모리에서 쓰레기 객체가 된다.
		// -> 가비지 컬렉터에 의해서 자동 소멸 (언젠가...)
		d = null;
		
	}

}
