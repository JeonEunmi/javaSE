package com.test094;

public class Outer {

	// 중첩 클래스(Static Inner Class)
	// 클래스 선언 안에 또다른 클래스 선언이 있는 상태를 중첩 클래스라고 한다.
	// 중적(static) 멤버(
	// 필드
	private int a;
	
	// 생성자
	public Outer() {
		
	}
	
	// 메소드
	public void method() {
		
		Inner.smethod();
	}
	
	// 중첩 클래스(Static Nested Class)
	// -> 현재 클래스 내에서만 사용하는 전용 자료형으로서 클래스 역할
	private static class Inner {
		
		public void method() {
			System.out.println("Static Nested Class의 인스턴스 메소드 호출");
		}
		
		public static void smethod() {
			
		}
	}
	
	public static class Test{
		public void method() {
			System.out.println("테스트");
		}
	}
}
