package com.test038;

// class가 public이면 자동생성 생성자도 public 이다. 단, 명시적으로 표기 시 내가 원하는 접근제한자 사용가능하다.
public class Test {

	// private 생성자
	// -> 생성자는 객체 생성과 관련있기 때문에 public 접근제한자 주로 사용한다.
	// ->private 생성자는 외부 접근 불가. 객체 생성(instance) 생성 불가. instance 멤버(field, method) 접근
	// 불가
	// ->외부에서 객체(instance)를 생성하는 과정을 통제하는 수단
	// 클래스 내부에서 객체 생성 후 제공 -> 정적 메소드
	// ->모든 하위 멤버가 static 인 경우, 객체 생성 불필요. 예를 들어, Math 클래스

	// 필드(field)
	private int a;

	// 매개변수 있는 생성자(constructor) -> private
	private Test() {

	}

	// getter, setter -> public
	public int getA() {
		return this.a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void method() {
		System.out.println(this.getA());

	}
}
