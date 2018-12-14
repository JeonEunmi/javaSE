package com.test091;

public class Outer {

	// 중첩 클래스(Inner Class)
	// 클래스 선언 안에 또다른 클래스 선언이 있는 상태를 중첩 클래스라고 한다.
	// 인스턴스 멤버(필드, 메소드 등)으로 등록된 중첩 클래스
	
	// 필드
	private int a;
	
	// 생성자
	public Outer() {
		
	}
	
	// 메소드
	public void method() {
		
		// Inner Class의 객체 생성
		Inner inner = new Inner();
		
		// Inner Class 객체의 인스턴스 멤버 접근
		inner.method();
	}
	
	// 중첩 클래스(Inner Class)
	// -> 현재 클래스 내에서만 사용하는 전용 자료형으로서 클래스 역할
	private class Inner {
		// 고유한 필드, 생성자, 메소드 구성 가능
		// 단, 정적(static) 멤버 구성 불가
		
		public void method() {
			System.out.println("이너 클래스");
		}
	}
	
	
	// 중첩 클래스 (Inner Class)
	// -> 접근 제한자가 private가 아닌 경우 외부에서 접근 가능
	// -> 독립적인 클래스로 구성하는 것을 권장
	public class Test{
		public void method() {
			
		}
	}
	
}
