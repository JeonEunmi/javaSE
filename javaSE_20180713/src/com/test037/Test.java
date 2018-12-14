package com.test037;

public class Test {

	// this 키워드
	// -> 객체(instance) 생성시 현재 객체의 참조주소가 저장될 변수
	// -> 현재 객체의 하위(instance) 멤버(field, method, constructor) 접근시 사용
	// -> instance method 영역 내에서만 사용 가능 (static 안에서 사용 불가능)
	
	//필드(field)
	private static int a;
	
	//기본생성자
	public Test() {
		//매개변수 있는 생성자 호출 , 명시적 초기화
		//필수적은 아니지만, 생성자가 여러개 생성되었을 때 사용한다.
		this(10);
	}	

	//매개변수 있는 생성자(constructor) -> public
	public Test(int a) {
		this.a = a;
	}
	
	//getter, setter -> public
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
