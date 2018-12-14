package com.test036;

public class Main {

	public static void main(String[] args) {
		// Test 클래스의 객체(instance) 생성
		
		// new -> 객체 생성. heap 영역
		// Test() -> 기본 생성자 호출. 필드((field) 초기화 - 자동 초기화, 명시적 초기화
		// Test t = -> 객체의 참조주소 저장. stack 영역.
		
		//생성자에 의한 초기화
		Test t1 = new Test(10);
		System.out.println(t1.getA());   //Test 클래스
		//System.out.println(t1.toString());  //Object 클래스
		
		//setter에 의한 초기화 -> 반복호출
		t1.setA(20);
		System.out.println(t1.getA());
		
		t1.setA(30);
		System.out.println(t1.getA());
		
		/*
		Test t2 = null;
		
		System.out.println(t2.getA());  //NullPointException
		*/
	}

}
