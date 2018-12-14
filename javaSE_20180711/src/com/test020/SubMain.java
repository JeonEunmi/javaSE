package com.test020;

import java.util.Scanner;

//서브메뉴 운영 클래스
public class SubMain {
	
	//Test 클래스의 객체를 필드로 구성
	private Test t = new Test();
		
	//메인 메뉴별로 별도의 메소드 구성
	
	//메인메뉴 '1.진법변환' 선택시 호출되는 서브메뉴 메소드
	public void method1 (Scanner sc) {
		// 서브 메뉴 운영에 관련된 메소드

		while(true) {
			System.out.println("====================================================");
			System.out.println("1. 2진수 -> 10진수  2. 10진수 -> 2진수  3. 메인으로");
			System.out.println("====================================================");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 3) break;
			
			if(selectNo == 1) {
				//서브 메뉴별 액션 코드를 별도의 메소드로 구현 필요
				this.subMethod1();
			}
			
			if(selectNo == 2) {
				//액션 코드 -> 독립적인 클래스의 독립적인 메소드로 표현
				this.subMethod2();
			}
			

		}

	}
	
	//서브메뉴별 액션을 private 메소드로 변환
	//2.2진수 -> 10진수
	private void subMethod1() {
		//문제)
		//10진수를 2진수로 변환하는 메소드 호출
		//실행예)
		/*
		10(10) -> 1010(2)
		15(10) -> 1111(2)
		*/ 
		System.out.printf("%s(2) -> %s(10)%n", "1010", t.toDec("1010"));
		System.out.printf("%s(2) -> %s(10)%n", "1111", t.toDec("1111"));//"1010(2) -> 10(10)"
	}
	
	//서브메뉴별 액션을 private 메소드로 변환
		//2.10진수->2진수
		private void subMethod2() {
		System.out.printf("%s(10) -> %s(2)%n", "10", t.toBin("10"));
		System.out.printf("%s(10) -> %s(2)%n", "15", t.toBin("15"));
		
		}
}
