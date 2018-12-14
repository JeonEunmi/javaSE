package com.test;

public class OOP001 {

	public static void main(String[] args) {
		
		// 객체 지향
		// 객체(Object) - 프로그램의 대상이 될 수 있는 모든 것
	    // 예를 들어 사람, 자동차 등을 자료(데이터, 객체)로 표현할 수 있다면, 프로그램의 대상이 될 수 있다.
		// 클래스(Class) - 객체의 물리적 표현
		// 객체(instanca) - 클래스(Class)를 프로그램 실행을 위해서 메모리에 적재된 상태
		
		// Dog Class에 대한 객체(Dog instance) 생성 
		Dog d = new Dog();
		d.barking();
		
	}

}