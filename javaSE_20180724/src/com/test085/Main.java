package com.test085;

public class Main {

	public static void main(String[] args) {

		// 구현 클래스 객체 생성 후 변수에 참조주소 저장시 인터페이스 자료형 변수에 저장
		// Sub 클래스의 객체 생성
		// -> Super 자료형 변수에 저장
		// -> 자식 객체를 부모 자료형에 저장 가능 - 다형성 지원
		// Super s1 = new Sub();

		// Super 인터페이스의 특성을 제공 받아서 구현한 메소드
		// -> 메소드 오버라이딩
		// s1.method();

		// 인터페이스는 객체 생성 불가
		// Super s2 = new Super();

		// 익명 구현 객체
		Super s2 = new Super() {

			@Override
			public void method() {
				System.out.println("익명 구현 객체");
			}

		};
	}

}
