package com.test083;

public class Main {

	public static void main(String[] args) {
		// Sub 클래스의 객체 생성
		Sub s1 = new Sub();
		
		// Super 인터페이스의 특성을 제공받아서 구현한 메소드
		// 메소드 오버라이딩
		s1.method();
	}

}
