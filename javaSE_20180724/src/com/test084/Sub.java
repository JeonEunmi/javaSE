package com.test084;

// Super 인터페이스 구현 Sub 클래스 선언
// -> implements 키워드 사용
// -> extends 키워드와 같이 사용 가능
public class Sub implements Super {

	// 인터페이스의 추상 메소드에 대한 오버라이딩
	// 오버라이딩 구현시 접근제한자는 원본과 같거나, 넓은 경우만 가능
	@Override
	public void method() {
		// 실체 구현
		System.out.println("인터페이스의 구현 메소드");
	}

	
}
