package com.test041;

public class Test {
	
	//소멸자
	//->객체 소멸시 자동 호출되는 메소드.
	//소멸자 형식
	/*
	public void finalize() {
		
	}
	*/
	
	public Test() {
		System.out.println("생성자 호출!");
	}
	
	public void finalize() {
		System.out.println("소멸자 호출!");
	}

}

