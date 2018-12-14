package com.test001;

//라이브러리 클래스
public class Sample {
	
	// 메소드 - 클래스 구성 요소
	public void msg() {
		System.out.println("Hello, World!");
	}
	// 메소드 - 클래스 구성 요소
	public void test() {
		
		//같은 패키지의 다른 클래스 접근
		//public 키워드 없는 클래스의 객체 생성
		Test t = new Test();
		t.msg();
		
	}
}
