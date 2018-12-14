package com.test031;

public class Test {

	// 메소드 오버로딩(Method Overloading) - 유사한 기능을 여러가지 작성할때
	// 메소드 이름, 매개변수 자료형, 매개변수 갯수가 일치하는 메소드가 여러개 선언된다.
	// 예를 들어, println() 메소드는 메소드 오버로딩 상태이다.
	
	// 외부에서 전달받는 자료의 형태가 다양하게 연출되도록 메소드를 선언한다.
	// 1. 정수 값 1개 전달시 팩토리얼 연산 및 결과 반환
	// 2. 정수 값 2개 전달시 합 연산 및 결과 반환
	// 3. 실수 값 2개 전달시 합 연산 및 결과 반환
	// 4. 정수 값 여러개 전달시 합 연산 및 결과 반환 (배열, 가변 매개변수 중 하나)
	
	public int test(int a) {
		int result = 1;
		for(int i = 0; i < a; i++) {
			result  *= (a-i);
		}
		return result;
	}
	
	public int test(int a, int b) {
		int result = 0;
		result = a + b;	
		return result;
	}
	
	public double test(double a, double b) {
		double result = a + b;
		return result;
	}
	
	/*
	public int test(int ... args) {
		int result = 0;
		for(int i = 0; i < args.length; i++) {
			result += args[i];
		}
		return result;
	}*/
	
	public int test(int[] arr) {
		int result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}

}
