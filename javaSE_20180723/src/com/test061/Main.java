package com.test061;

public class Main {

	public static void main(String[] args) {
		
		// Sub 클래스의 객체 생성
		// 객체 생성 및 기본 생성자 호출
		Sub sub1 = new Sub();
		System.out.println(sub1.getAge());
				
		// 객체생성 및 매개변수가 있는 생성자 호출
		Sub sub2 = new Sub(20);
		System.out.println(sub2.getAge());
		
	}
}
