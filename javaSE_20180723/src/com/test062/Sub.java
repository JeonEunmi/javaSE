package com.test062;

public class Sub extends Super {

	// 자기 자신의 필드(age)가 없다.

	// Implicit super constructor Super() is undefined.
	public Sub() {
		// 자동 실행되었지만, 부모(Super) 클래스에는 기본 생성자가 없어서 오류 발생
		// 따라서 자식 클래스도 기본 생성자 선언을 할 수 없게 된다.
		// super(); 
		
		// 해결법 -> 부모의 매개변수가 있는 생성자를 이용하여, 강제 호출
		// sub클래스의 기본 생성자 생성
		super(0);
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
