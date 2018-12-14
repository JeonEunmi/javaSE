package com.bankAccount.main;

import java.util.*;

import com.bankAccount.service.AdminSubMain;
import com.bankAccount.service.OwnerSubMain;
// 메인 클래스
public class Main {

	/*
	- 계좌조회, 계좌입금, 계좌출금 기능 구현
	- 계좌주 개인정보와, 계좌정보, 거래내역 등을 관리
	- 계좌주 개인정보는 이름, 전화번호로 구성
	- 계좌정보는 계좌번호, 현재잔액, 계좌생성일, 비밀번호, 마지막거래일로 구성
	- 거래내역은 계좌번호, 입출금액, 입출금일, 입출금구분, 잔액으로 구성
	- 관리자 전용 화면 구현. 사용자 화면에서 메뉴번호가 아닌 특정번호 입력시 관리자 화면으로 이동 가능. 
	- 관리자 전용 화면에서 계좌생성, 전체계좌조회 및 입출금내역 출력 담당
	- 직렬화/역직렬화 기능 구현
	*/
	
	// 메인 메뉴 관리
	// 1.계좌조회 2.계좌입금 3.계좌출금 4.종료
	// -> 관리자전용인 99번은 노출되지 않는다.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		AdminSubMain admin = new AdminSubMain();
		
		OwnerSubMain owner = new OwnerSubMain();
		
		
		while(true) {
			
			System.out.println("**계좌관리 v1.0**");
			System.out.println("1.계좌조회 2.계좌입금 3.계좌출금 0.종료");
			System.out.print("선택> ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			if(selectNum == 0) {
				break;
			}
			
			switch(selectNum) {
			
			case 1 : 
				owner.accountSearch();
				break;
			case 2 :
				owner.accountIn();
				break;
			case 3 :
				owner.accountOut();
				break;
			case 99 :
				admin.adminsub();
				break;
			default : 
				break;
			}
			
			
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
