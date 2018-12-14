package com.test093;

public abstract class Outer {

	// 중첩 클래스(Anonymous Inner Class)
	// -> 클래스 선언 안에 또다른 클래스 선언이 있는 상태를 말한다.
	// -> 명시적 클래스 선언 없이 자식 클래스 작성
	// -> 자기 자신이 직접 객체로 생성될 수 없는 클래스(추상 클래스) 사용시
	//   상속 과정 없이 바로 사용 가능
	
	// 일반 메소드
	public void method1() {
		
	}
	
	// 추상 메소드
	public abstract void method2();
	
}
