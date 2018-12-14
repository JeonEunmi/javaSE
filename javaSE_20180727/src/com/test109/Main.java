package com.test109;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// Random 클래스
		// -> 난수 발생
		// -> 특정 정수 범위 난수 발생시 nextInt() 메소드 사용
		
		// 로또 번호 난수 발생 -> 기존 방식
		for (int i = 0; i < 10; i++) {
			System.out.println((int)(Math.random()*45) + 1);
		}
		System.out.println("========================");
		// 로또 번호(1~45) 난수 발생 -> Random 클래스의 nextInt() 메소드
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(r.nextInt(45)+1);
		}
	}

}
