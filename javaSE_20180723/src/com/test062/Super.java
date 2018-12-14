package com.test062;

public class Super {

	private int age;
	
	// 기본 생성자 필요

	// 매개변수가 있는 생성자
	public Super(int age) {
		this.age = age;
		System.out.println("Super 클래스의 매개변수가 있는 생성자");
	}

	// getter
	public int getAge() {
		return this.age;
	}

}
