package com.test036;

public class Test {

	//생성자 오버로딩(Overloading)
	//->생성자가 여러개 선언된 상태
	//생성자 형식
	/*
	접근제한자 클래스이름(매개변수) {
		//실행코드
	}
	*/
	
	//매개변수가 있는 생성자 선언시 기본 생성자는 자동 제공
	//->기본 생성자 명시적 선언 필요
	
	
	//필드(field)
	private int a;
	
	//기본 생성자
	public Test() {
		
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
	
}
