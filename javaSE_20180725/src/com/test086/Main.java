package com.test086;

public class Main {

	public static void main(String[] args) {

		// Sub1 클래스의 객체 생성
		Sub1 s1 = new Sub1();
		s1.method(); // 공통 메소드
		s1.sub1(); // 고유 메소드

		// Sub2 클래스의 객체 생성
		Sub2 s2 = new Sub2();
		s2.method(); // 공통 메소드
		s2.sub2(); // 고유 메소드

		// 객체 생성 후 참조주소 저장 변수의 자료형을 인터페이스로 지정
		Super s3 = new Sub1();
		s3.method(); // 공통 메소드 호출 시 다른 결과 나올 수 있다.
		// s3.sub1(); // 멤버 접근 제한

		// 다형성 (Polymorphism) - 하나의 자료형을 가진 변수에 다양한 자료형의 객체 저장
		// 자동 타입 변환 ( 암시적 형변환)
		// -> Sub2 객체의 자료형은 Sub2 이어야 하지만 Super 자료형 변수에 저장 가능
		Super s4 = new Sub2();
		s4.method();
		// s4.sub2(); // 멤버 접근 제한

		// Sub1 자료형을 가진 배열 선언
		Sub1[] sub1List = new Sub1[5];
		sub1List[0] = new Sub1();
		// sub1List[1] = new Sub2(); // Sub2 객체 지정 불가 - 동일 자료형만 가능

		// Super 자료형을 가진 배열 선언
		Super[] superList = new Super[5];
		superList[0] = new Sub1(); // Sub1 객체 저장 가능
		superList[1] = new Sub2(); // Sub2 객체 저장 가능

		// 강제 타입 변환(명시적 형변환)
		// -> 인터페이스 자료형 변수, 조상 클래스 자료형 변수에 저장된
		// 하위 객체의 원래 자료형으로 변환
		superList[0].method();
		// superList[0].sub1(); // 멤버 접근 제한
		((Sub1) superList[0]).sub1(); // 멤버 접근 가능

		// instanceof 연산자
		// 자료형 검삭하는 연산자
		((Sub1) superList[1]).sub1(); // java.lang.ClassCastException:

		// -> 해결
		if (superList[1] instanceof Sub1) {
			((Sub1) superList[1]).sub1();
		}

	}

}
