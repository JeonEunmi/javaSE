package com.test;

public class OOP010 {

	public static void main(String[] args) {

		// Employee 클래스의 객체 (instance) 생성
		// new 연산자 - 클래스에 대한 객체 생성
		// -> 기본 생성자 호출
		Employee e = new Employee();
		// . 연산자 -> 객체의 하위 멤버 접근시 사용
		System.out.println(e.toString());
	}

}
