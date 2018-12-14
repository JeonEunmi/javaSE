package com.test088;

// 추상 클래스에 대한 상속 지정
public class Sub extends Super{

	// 기본 생성자
	// -> 자동 생성
	// -> 호출 시 내부적으로 super() 생성자 호출
	public Sub() {
		// super();
	}
	
	// 일반 메소드에 대한 오버라이딩 선택
	// -> 오버라이딩 안한 경우 부모의 기능 그대로 사용
	
	// 추상 메소드에 대한 오버라이딩 필수 
	@Override
	public void method2() {
		System.out.println("추상 메소드에 대한 구현 메소드");
		
	}

}
