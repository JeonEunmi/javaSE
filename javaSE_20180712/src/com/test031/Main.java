package com.test031;

public class Main {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("1. 정수 값 1개 전달시 팩토리얼 연산 및 결과 반환");
		System.out.println("결과 : " + t.test(5));
		System.out.println();
		
		System.out.println("2. 정수 값 2개 전달시 합 연산 및 결과 반환");
		System.out.println("결과 : " + t.test(10, 20));
		System.out.println();
		
		System.out.println("3. 실수 값 2개 전달시 합 연산 및 결과 반환");
		System.out.println("결과 : " + t.test(10.0, 20.0));
		System.out.println();

		System.out.println("4. 정수 값 여러개 전달시 합 연산 및 결과 반환 (배열, 가변 매개변수 중 하나)");
		System.out.println("결과 : " + t.test(arr));
		
	}

}