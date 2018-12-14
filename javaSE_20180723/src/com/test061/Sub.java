package com.test061;

public class Sub extends Super {

	// 자기 자신의 필드(age)가 없다.
	
	public Sub() {
		// super 키워드를 이용한 Super 클래스의 기본 생성자 호출
		// super();   --> 보이지 않지만 super()가 생략되어있다.
		System.out.println("Sub 클래스의 기본 생성자");
	}

	public Sub(int age) {
		// super키워드를 이용한 Super 클래스의 매개변수가 있는 생성자 호출
		super(age);
		// this.age = age;
		System.out.println("Sub 클래스의 매개변수가 있는 생성자");
	}
	
	// Super 클래스의 public 멤버 접근 가능
	// -> getAge()
	// -> 부모(Super) 클래스 age 변수의 값 반환
}
