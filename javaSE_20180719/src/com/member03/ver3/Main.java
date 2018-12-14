package com.member03.ver3;

import java.util.*;

// 메인메뉴 운영 클래스 선언
public class Main {
	
	// main() 메소드만 구성
	public static void main(String[] args) {
		// 회원관리 v1.3
		
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();
		
		boolean flag = true;
		
		System.out.println("**회원관리 시스템 (버전 1.1)**");
		
		//메인 메뉴 구성
		while(flag) {
			System.out.println("1. 회원정보입력 | 2.회원번호출력 | 3.회원정보검색 | 4. 종료");
			System.out.print("선택 > ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
				
			case 1 :
				sub.join(sc);
				break;
			
			case 2 :
				sub.memberOutput();
				break;
			
			case 3 :
				sub.memberSearch(sc);
				break;
				
			case 4 :
				flag = false;
				break;
				
			default : 
				break;
			}
			
		}

		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
