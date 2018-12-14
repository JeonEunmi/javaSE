package com.test068;

// 상속은 가능
public class Sub extends Super{

	// 오버라이딩 가능 메소드 -> public, protected
	@Override
	public void method1() {
		
	}
	
	// 부모의 메소드를 오버라이딩하는 것은 제한
	// -> final method
	// 오버라이딩 금지 메소드 -> final 키워드 추가 (부분 금지)
	/*
	@Override
	public final void method2() {
		
	}
	*/
	// -> 부모의 메소드를 그대로 사용하는 것은 가능
	
}
