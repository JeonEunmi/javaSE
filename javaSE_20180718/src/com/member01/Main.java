package com.member01;

import java.util.*;

// 메인메뉴 운영 클래스 선언
public class Main {
	
	// main() 메소드만 구성
	public static void main(String[] args) {
		// 회원관리 v1.0 (콘솔 버전)
		/* 입력, 출력, 삭제, 검색, 수정 -> 5개 모두 하면 성공!
		 * 1.0 요구분석 - 회원 정보 입력, 회원 정보 전체 출력
		 * 1.1 회원 정보 검색(이름, 전화번호, 이메일, 등록월(yyyy-MM) 선택 가능, 서브메뉴 운영) - 이름, 전화번호, 이메일, 등록일(yyyy-MM-dd)
		 * 회원번호('M01' 형태 - 고유번호이므로 중복x) 1.회원정보입력  2.회원정보출력  3.회원정보검색 4.종료
		 */
		
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();
		boolean flag = true;
		
		System.out.println("**회원관리 시스템**");
		
		//메인 메뉴 구성
		while(flag) {
			System.out.println("1. 회원정보입력 | 2.회원번호출력 | 3. 종료");
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
				flag = false;
				break;
			}
			
		}

		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
