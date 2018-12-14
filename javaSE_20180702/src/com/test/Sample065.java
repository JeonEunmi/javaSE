package com.test;

public class Sample065 {

	public static void main(String[] args) {
		
		// String 클래스
		// equals(), equalsIgnoreCase() 메서드
		
		// 메서드 형식
		
		/*
		메소드 형식
		
		public boolean equals(Object anObject)
		접근자료형 반환자료형 메소드이름(매개변수)
		접근자료형 - 외부에서 접근 가능 여부 결정
		반환자료형 - 메소드 실행후 결과값 자료형
		매개변수 - 메소드 실행에 필요한 외부 자료를 받을 수 있는 변수
		*/
		
		String a = "TEST";
		String b = "Test";
		String c = "test";
		String d = c;
		
		// 자료비교
		System.out.println(a.equals(b));   //false
		System.out.println(a.equalsIgnoreCase(b));   //true
		System.out.println(c.equals(d));   //true
		System.out.println(c.equalsIgnoreCase(d));   //true
		// 참조주소비교
		System.out.println(c == d);        //true

	}

}
