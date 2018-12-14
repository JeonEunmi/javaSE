package com.test045;

public class Test {

	// 싱글톤(singleton)
	// -> 디자인 패턴 (프로그램 방법론) 중의 한 가지로서 객체 생성을 통제하는 수단
	// -> 여러개의 객체가 생성되지 못하도록 막고, 한 개의 객체만으로 사용하도록 한다.
	
	// private 생성자, static 멤버
	
	// 외부로부터의 객체 생성 차단 -> private 생성자 
	private Test() {
		
	}
	
	// 한개의 객체만 유지하도록 미리 생성된 객체를 static 멤버에 저장
	private static Test t = new Test();
	
	// 미리 생성된 객체를 외부 제공하기 위한 메소드
	public static Test getInstance() {
		//참조주소 반환
		return Test.t;
	}
}
