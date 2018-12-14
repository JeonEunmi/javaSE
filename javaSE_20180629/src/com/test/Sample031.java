package com.test;

public class Sample031 {

	public static void main(String[] args) {
		
		// 난수
		// 임의의 실수(0이상~1미만)를 동적 생성
		// 0.0000 ~ 0.99999
		// Math 클래스의 random() 메소드
		
		System.out.println(Math.random());
		
		// 난수 -> 실수 -> 정수화 -> 범위 지정 필요
		// 0.0000 ~ 0.99999 *100  -> 0.0000 ~ 99.999 -> (int) 적용 정수화 -> 0 ~ 99
		
		System.out.println((int)(Math.random() * 101));
		
		// 주사위 범위의 정수 난수 발생
		// 1~6
		System.out.println((int)(Math.random() * 6) + 1);
		
		// 로또 범위의 정수 난수 발생
		// 1~45
		System.out.println((int)(Math.random() * 45) + 1);
	}
}
