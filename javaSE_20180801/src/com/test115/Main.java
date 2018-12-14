package com.test115;

public class Main {

	public static void main(String[] args) {
		
		// 제네릭 메소드가 있는 Box 클래스에 대한 객체 생성
		// -> 제한된 타입파라미터에 대한 명시적 자료형 지정 필요

		//String 자료형 불가 -> Number 클래스의 하위 자료형이 아니다.
		// boolean result1 = Box.compare("TEST", "HELLO");
		// System.out.println(result1);
		
		//Integer 자료형 가능 -> Number 클래스의 하위 자료형 이다.
		boolean result2 = Box.compare(20, 20);
		System.out.println(result2);
	}

}
