package com.test032;

public class Main {

	public static void main(String[] args) {

		Test t = new Test();
		
		//1. 정수 값 여러개 전달시 합 연산 및 결과 반환. 가변 매개변수
		int result1 = t.calc1(1, 2, 3, 4, 5);
		System.out.println(result1);

		//2. 정수 값 여러개 전달시 합 연산 및 결과 반환. 배열 객체
		int[] temp = {1, 2 ,3 ,4 , 5, 0};
		t.calc2(temp);
		int result2 = temp[temp.length - 1];
		System.out.println(result2);
				
	}

}
