package com.test063;

//Object 클래스 상속
public class Super {

	// toString() 메소드를 공유하게 된다.
	// -> 원본 기능 그대로 사용하는 상태
	// -> 객체의 정보를 문자열로 반환
	
	// 자기만의 고유 멤버(메소드)
	public void method() {
		System.out.println("Super 클래스의 고유 멤버");
	}
}
