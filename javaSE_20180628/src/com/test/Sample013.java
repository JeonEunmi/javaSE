package com.test;

public class Sample013 {

	public static void main(String[] args) {
		
		// 배수
		// 예를 들어, 2의 배수(짝수) 2, 4, 6, 8, ... 는 2로 나누기한 경우 나머지가 0인 상태
		// 2의 배수가 아닌 경우, 2로 나누기한 경우 나머지가 1인 상태는 홀수이다.
		
		int a = 10;
		
		int b = a / 2;  //몫 연산

		int c = a % 2;  //나머지 연산
		
		double d = a / 2.0;  //나누기 연산 ,  정수와 실수의 연산
		
		int e = (int) (a / 2.0);  //몫 연산 , 강제 형변환
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}

}
 