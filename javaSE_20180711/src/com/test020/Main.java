package com.test020;

import java.util.*;

//메인메뉴 운영 클래스
public class Main {

	public static void main(String[] args) {
		
		// 메인 메뉴 구성
		// 1. 진법 변환  2. 종료 
		// 1번 메뉴 선택시 서브메뉴 출력
		// 1. 2진수 -> 10진수   2. 10진수 -> 2진수   3.종료
		
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();

		while(true) {
			System.out.println("=============================");
			System.out.println("  1. 진법변환     2. 종료   ");
			System.out.println("=============================");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 2) break;
			
			if(selectNo == 1) {
				//액션 코드 -> 독립적인 클래스의 독립적인 메소드로 표현
				//서브 메뉴 클래스의 특정 메소드 호출(calling)
				sub.method1(sc);
			}	
			
		}
		sc.close();
		System.out.println("프로그램 종료");	
		
	}

}
