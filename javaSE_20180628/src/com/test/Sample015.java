package com.test;

public class Sample015 {

	public static void main(String[] args) {
		
		// 연산자
		// 비교 연산자
		// -> 결과는 true or false
		// ==, !=, >, <, >=, <=
		
		int a = 10;
		int b = 20;
		
		System.out.println(a == b);   // false
		System.out.println(a != b);   // true
		System.out.println(a > b);    // false
		System.out.println(a < b);    // true
		System.out.println(a >= b);   // false
		System.out.println(a <= b);   // true
		
		// 실수 비교 연산시 주의! 
		// 비교 대상의 자료형이 다를 경우 형변환 과정에서 정밀도가 떨어져
		// 손실이 발생할 수 있어 정확한 결과가 나오지 않을 수 있다.
		
		double c = 0.1;
		float d = 0.1f;
		
		System.out.println(c == d);   // 메모리 상 구조 때문에 값 차이 발생
		System.out.println((float)c == d);
		System.out.println(c == (double)d); // float가 double로 바뀌는 과정에서 손실 발생
	}

}

 