package com.test085;

// 인터페이스 선언시
// public interface 키워드 사용
// -> 객체 생성 불가
// -> 구현 클래스가 존재하는 경우만 사용 가능
public interface Super {

	// 추상 메소드, 상수 멤버, 디폴트 메소드, 정적 메소드만 구성 가능

	// 추상 메소드는 abstract 키워드가 있는 메소드 선언이다.
	// -> 자기 자신 호출을 위해서 존재하는 것이 아니라,
	// 자식 클래스에 의한 오버라이딩을 위해서 존재한다.
	public abstract void method();

}
