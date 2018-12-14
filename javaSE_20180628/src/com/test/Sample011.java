package com.test;

public class Sample011 {
	
	public static void main(String[] args) {
		
		// 형변환 -> 현재 자료형을 다른 자료형으로 바꾼다.
		// 강제(명시적), 자동(암시적)
		// 자료의 형과 변수의 형이 서로 다를 때 형변환 발생
		
		// 자동 형변환
		// -> 작은 자료형의 값을 큰 자료형의 변수에 저장
		
		int a = 10; // int형 변수 = int형 자료; -> 이런경우는 형변환이 발생하지 않는다.
		
		long b = 10; // long형 변수 = int형 자료; -> 자동 형변환 발생
		
		// int c = l0L;
		// int형 변수 = long형 자료; ->type mismatch!! 강제 형변환 필요
		
		int d = 'A';  //자동 형변환
		char e = 65;  //자동 형변환
		
		byte b1 = 10;
		byte b2 = 20;
		// byte b3 = b1+b2;  // 정수 연산 수행시 결과는 int형
		
		int i1 = 10;
		int i2 = 20;
		int i3 = i1+i2;
		
		int d1 = 10;
		// int d2 = d1 / 3.0;  //정수, 실수 연산 수행시 결과는 double형
		double d3 = d1 / 3.0;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);  //65
		System.out.println(e);  //A
		System.out.println(i3);
		System.out.print(d3);
						
	}
}
