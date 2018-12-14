package com.test;

public class Sample014 {

	public static void main(String[] args) {
		
		// 연산자
		// 산술 연산자 
		// [이항연산자] : +, -, *, /, % [단항 연산자] : ++, --
		
		// ++ : 1 증가
		// -- : 1 감소
		
		int a = 10;
		System.out.println(a);    // 10
		System.out.println(++a);  // 11 -> 연산 수행 후 변수 사용
		System.out.println(a++);  // 11 -> 변수 사용 후 연산 수행
		System.out.println(a);    // 12
		System.out.println(--a);  // 11
		System.out.println(a--);  // 11
		System.out.println(a);    // 10
	}

}
 