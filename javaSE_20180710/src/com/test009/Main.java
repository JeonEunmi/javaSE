package com.test009;

public class Main {

	public static void main(String[] args) {
		
		//Calculator 클래스에 대한 객체(instance) 생성
		Calculator cal = new Calculator();
		
		//전원 on/off 상태 확인 없이 바로 호출한 경우
		System.out.println(cal.plus(40, 5));   //35
		
		//전원 on
		cal.power();
		
		//산술 연산
		System.out.println(cal.plus(10, 20));   //30
		System.out.println(cal.substract(30, 10));   //20
		
		//전원 off
		cal.power();
		
		//전원 off상태에서 연산
		System.out.println(cal.plus(60, 20));    //80
		
		//전원 on
		cal.power();
		
		//산술 연산
		System.out.println(cal.substract(50, 20));   //30
	}

}
