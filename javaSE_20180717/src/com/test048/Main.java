package com.test048;

public class Main {

	public static void main(String[] args) {

		// final field -> 수정 불가 항목

		// 초기화
		Test t = new Test();

		// 수정 가능
		t.setName("HONG");
		
		// 읽기 가능
		System.out.println(t.getName());

		// 수정 불가
		// t.setDept("TEST");
		
		// 상수 
		// 객체(instance) 생성과 무관하게 읽기 가능
		System.out.println(Test.DEPT);
		
		//대표적인 상수로 최대값, 최소값 표현
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Math.PI);
		
	}
}
