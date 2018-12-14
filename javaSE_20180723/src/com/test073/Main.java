package com.test073;

public class Main {

	public static void main(String[] args) {
		
		// Super 클래스의 객체 생성
		Super s1 = new Super();
		Super s2 = new Super();
		
		// 참조주소 출력
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		// 참조주소 비교
		// -> equals() 메소드 시그니처 확인
		// -> public boolean equals(Object obj)
		// -> Super 자료형 객체 -> Object 자료형 obj 변수에 전달
		// -> 매개변수의 자료형이 클래스(Object 클래스)인 경우 매개값(Super 자료형의 객체) 은 자식 객체도 가능
		// -> 매개변수의 다형성(하나의 자료형 변수에 여러 자료형의 객체가 저장될 수 있는 능력)
		
		System.out.println(s1.equals(s2));  // false
		
		// 값 비교
		// -> 오버라이딩 equals() 메소드
		// -> String 클래스의 equals() 메소드
		String str1 = new String("TEST");
		String str2 = new String("TEST");
		System.out.println(str1.equals(str2));  // true
		
		// 동일한 정보를 가진 두 개의 Member 객체 준비
		Member m1 = new Member("M01", "hong","010-1234-1234");
		Member m2 = new Member("M01", "hong","010-1234-1234");
	
		// 값 비교 -> 회원아이디가 일치하는지 확인
		// -> equals() 메소드 오버라이딩
		System.out.println(m1.equals(m2));  // true
		
	}

}
