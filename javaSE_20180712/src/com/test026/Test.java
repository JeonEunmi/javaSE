package com.test026;

public class Test {
	
	//Member 클래스 자료형을 가진 매개변수 선언
	//선언된 매개변수는 한 개이지만, 내부적으로는 자료가 String 이름, String 전화, int 나이 라는 세 개의 데이터를 보유
	public void method(Member m) {
		System.out.println(m.getName());
		System.out.println(m.getPhone());
		System.out.println(m.getAge());
	}
}
