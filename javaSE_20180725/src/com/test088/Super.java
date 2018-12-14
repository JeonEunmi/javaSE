package com.test088;

// 추상 클래스 선언
// -> 일부 멤버가 추상 메소드인 경우 추상 클래스로 선언해야 한다.
// -> 추상 메소드가 없어도 추상 클래스로 선언 가능
// -> 자기 자신의 객체(instance) 생성 불가
// -> 조상(부모) 클래스 역할
public abstract class Super {

	// 생성자 구성 가능
	// -> 자식 클래스의 생성자를 통해서 부모 클래스 생성자 호출
	public Super() {
		System.out.println("Super 클래스의 생성자");
	}
	
	// 일반 메소드 구성 가능
	// -> 메소드 시그니처 + 구현부(실행코드)
	// -> 자식 객체의 메소드를 호출을 통해서 부모 객체 메소드 호출
	public void method1() {
		System.out.println("Super 클래스의 method1()");
	}
	
	// 추상 메소드 구성 가능
	// -> 메소드 시그니처
	// public abstract 키워드 생략 불가
	public abstract void method2();
}
