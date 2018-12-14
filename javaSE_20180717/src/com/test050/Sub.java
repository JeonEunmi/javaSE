package com.test050;

// 상속 관계에서 자식 역할 클래스
// -> extends 키워드
// 부모 클래스 선택권은 자식에게 있다.
// -> 여러개의 부모를 동시 선택할 수는 없다. 다중 상속 불가
// 고유 기능 구현시 자식 클래스에서 작성
public class Sub extends Super {

	// Object, Super 클래스의 기능(메소드) 사용 가능

	// 기능(메소드) 확장
	// 자기만의 기능(메소드) 추가 가능
	public void method() {

	}
}
