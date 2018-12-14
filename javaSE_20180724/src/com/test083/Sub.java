package com.test083;

// Super 인터페이스 구현 Sub클래스 선언
// ->Super 인터페이스의 추상 메소드에 대한 오버라이딩(실체 구현) 필수
public class Sub implements Super{

	@Override
	public void method() {
		// 실체 구현 - 사용자 정의
		System.out.println("인터페이스의 구현 메소드");
	}
	
}
