package com.test;

public class Sample063 {

	public static void main(String[] args) {
		
		// null, NullPointerException
		
		// 연결된 객체가 있어야하는데, 없는 경우!
		// 참조형 변수 선언시 자료(객체)를 할당하지 않는 경우
		// -> null 할당
		
		String a = "TEST";
		
		String b = null;
		
		System.out.println(a.length());
		System.out.println(b.length());
		
	}

}
