package com.test034;

public class Test {
	
	// 필드 선언 및 초기화
	// 자동 초기화, 명시적 초기화, (정적) 초기화 블럭, 생성자
	// 내부 설정 - 자동 초기화, 명시적 초기화, (정적) 초기화 블럭
	// 외부 설정 - 생성자
	
	
	//생성자
	//->객체 생성시 자동 호출되는 메소드. (instance) 필드 초기화.
	//생성자 형식
	/*
	접근제한자 클래스이름(매개변수) {
			//실행코드
	}
	*/
	
	//매개변수가 있는 생성자
	//->생성자 호출시 외부 자료를 전달 받아서 필드 초기화 액션 수행.
	//->사용자에 의해 명시적 선언 필요
		
		
	
	//필드(field)
	private int a;
	
	//생성자(constructor) -> public // 객체생성시 
	public Test(int a) {
		this.a = a;
	}
	
	//getter, setter ->public
	public int getA() {
		return this.a;
	}
	
	//생성자와는 생성시점이 다르다. setter는 명시적 초기화시 생성
	public void setA(int a) {
		this.a = a;
	}

}
