package com.test;

public class Sample012 {

	public static void main(String[] args) {
		
		// 강제 형변환
		// -> 큰 자료형의 값을 작은 자료형의 변수에 저장
		// -> 손실 가능성 존재
		
		// 캐스트 연산자
		// ->기본 자료형에서만 캐스트 연산자 사용 가능
		// 작은 자료형 변수 = (작은 자료형) 큰 자료형 값;
		
		// int c = 10L; //int형 변수 = long형 자료   //강제 형변환 필요
		int c = (int) 10L;
		
		int d1 = 10;
		int d2 = (int) (d1 / 3.0); //정수, 실수 연산 수행
		//d2 강제 형변환 과정에서 손실발생!!! 소수점 아래가 모두 버려짐 정수화
		
		System.out.println(c);
		System.out.println(d2);

	}

}
 