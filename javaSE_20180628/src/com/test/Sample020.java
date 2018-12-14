package com.test;

public class Sample020 {

	public static void main(String[] args) {
		
		// 연산자
		// 삼항 연산자 (조건 연산자)
		// (조건식) ? 값1 : 값2
		// 조건식의 결과가 참이면 값1 반환
		// 조건식의 결과가 거짓이면 값2 반환
		
		int a = 10;
		System.out.println(a);
		System.out.println((a > 10) ? "a는 10보다 큽니다" :"a는 10보다 작거나 같습니다");
		
		// 변수 a1, a2, a3에 정수가 있다고 가정
		// 가장 큰 정수가 들어 있는 변수 이름 (문자열, String) 출력
		int a1 = 40;
		int a2 = 50;
		int a3 = 30;
		
		String result = "";
		result = (a1 > a2) ? "a1" : "a2";
		int tmp = 0;
		tmp = (a1 > a2) ? a1 : a2;
		String result2 = "";
		result2 = (tmp > a3) ? result : "a3";
		
		System.out.println(result2);
		
		System.out.println((a1 > a2) ? "a1" : (a2 > a3) ? "a2" : "a3");   // 위 연산식과 동일
	}

}

 