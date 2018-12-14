package com.test050;

public class Main {

	public static void main(String[] args) {

		// 자식 역할 클래스인 Sub 클래스의 객체(instance) 생성
		Sub sub = new Sub();

		// Sub 클래스는 구현된 기능(메소드)이 없지만
		// 부모 역할 클래스의 기능을 사용할 수 있다.
		// toString() -> Object 클래스의 메소드
		// -> 자동 호출 -> 생략 가능
		System.out.println(sub.toString());
		System.out.println(sub);
		
		//자기만의 기능(메소드) 호출 가능
		sub.method();
	}
}
