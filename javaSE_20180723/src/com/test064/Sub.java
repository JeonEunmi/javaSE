package com.test064;

public class Sub extends Super{
	
	// this, super 변수 -> 자동 선언 -> 객체의 참조 주소 할당

	// Super 클래스의 method1() 메소드만 오버라이딩
	// -> 부모 객체의 method1() 메소드는 자식 객체에 의해 숨겨진다.
	public void method1() {
		System.out.println("Sub클래스의 method1()");
		//super 키워드를 사용하면 부모 객체를 접근할 수 있다.
		super.method1();
	}

	// Super 클래스의 method2() 메소드는 공유되는 상태
	// -> "Super 클래스의 method2()"
	
}
