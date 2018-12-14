package com.test063;

public class Sub extends Super{
	
	// 부모가 제공하는 toString() 메소드를 나만의 방식으로 재정의
	// -> 메소드 오버라이딩(method overriding)
	// -> 부모가 제공할 수 있는 메소드 목록 확인 필요
	// -> 부모 메소드 시그니처를 동일하게 작성
	// -> 메소드 내용은 재정의 한다.

	// Object 클래스의 toString() 메소드를 오버라이딩
	//@Override 어노테이션 표기 권장
	@Override
	public String toString() {
		return "Sub 클래스에서 오버라이딩된 메소드";
	}
	
	// Super 클래스의 method() 메소드를 오버라이딩
	//@Override 어노테이션 표기 권장	
	@Override
	public void method() {
		System.out.println("Sub 클래스에서 오버라이딩된 메소드");
	}	
	
}
