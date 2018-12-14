package com.test;

public class Sample022 {

	public static void main(String[] args) {

		// if문
		// 조건문의 결과에 따라서 실행문 실행 여부 결정
		// if (조건문) { 실행문; ... }
		// if~else문
		// if (조건문) { 실행문; ... } else { 실행문; ...}
		// if (조건문) { 실행문; ... } else if (조건문) { 실행문; ...} else { 실행문; ...}


		int a = 10;

		if (a >= 10) {
			System.out.println("a는 10보다 크거나 같습니다.");
			
		}
		
		if( a == 10) {
			System.out.println("a는 10입니다.");
		}
		
		/* if ( a = 10 ) {
			Sysetm.out.println("a는 10입니다.") 
			//비교 연산자가아니라, 대입연산자를 사용했으므로 NO!
		} */  
		

		int b = 15;

		if (b >= 10) {
			System.out.println("b는 10보다 크거나 같습니다.");
		} else {
			System.out.println("b는 10보다 작다.");
		}
		
		
		int c = 20;
		
		if (c>10) {
			System.out.println("c는 10보다 큽니다");
		} else if (c == 10) { 
			System.out.println("c는 10과 같습니다.");
		} else {
			System.out.println("c는 10보다 작다.");
		}
	}

}

