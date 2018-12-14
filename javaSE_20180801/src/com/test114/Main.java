package com.test114;

public class Main {

	public static void main(String[] args) {
		
		// 제네릭 메소드가 있는 Box 클래스에 대한 객체 생성
		// -> 타입파라미터에 대한 명시적 자료형 지정 필요

		//String 자료형 (암시적) 지정한 경우
		boolean result = Box.compare("TEST", "HELLO");
		System.out.println(result);
		
		//Integer 자료형 (명시적) 지정한 경우
		boolean result2 = Box.<Integer>compare(20, 20);
		System.out.println(result2);
	}

}
