package com.bankAccount.test;

import java.util.ArrayList;
import java.util.List;

import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.persistance.AccountDAO;

// 액션 테스트용 클래스
public class Test {

	public static void main(String[] args) {
		
		AccountDAO dao = new AccountDAO();
		
		List<AccountList> list = new ArrayList<AccountList>(dao.accountAllSearch());
		
		List<AccountList> list2 = new ArrayList<AccountList>(dao.accountIDSearch("2018030101"));
		
		List<AccountList> list3 = new ArrayList<AccountList>(dao.accountPersonalSearch("박길동", "010-5678-1234"));
		
		List<AccountHistory> his = new ArrayList<AccountHistory>(dao.accountIOPrint("2018030101", "20171212"));
		
		
		// 계좌조회 메소드 테스트
		// -> 전체
		/*
		전체계좌 목록
		--------------------------------------------         
		계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
		2017101001 / 200000 / 20171010 / 20180101 / 박길동 / 010-5678-1234
		총 1건
		*/

		System.out.println("전체계좌 목록");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");
		for(AccountList a : list) {
			System.out.println(a);
		}
		System.out.printf("총 %d 건 %n", list.size());
		
		
		
		System.out.println();		
		System.out.println("(2018030101) 계좌 목록");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");
		for(AccountList a : list2) {
			System.out.println(a);
		}
		System.out.printf("총 %d 건 %n", list2.size());
		
		
		System.out.println();		
		System.out.println("(박길동, 010-5678-1234) 계좌 목록");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");
		for(AccountList a : list3) {
			System.out.println(a);
		}
		System.out.printf("총 %d 건 %n", list3.size());
		
		
		
		
		System.out.println();
		System.out.println("계좌입출금내역 출력 메소드 테스트");
		// 계좌입출금내역 출력 메소드 테스트
		/*
		계좌번호>2018030101
		내역출력시작일>20171010
		(2018030101)님의 계좌입출금내역
		--------------------------------------------
		계좌번호 / 금액 / 입출금일 / 구분 / 잔액 
		2018030101 / 100000 / 20171010 / 입금 / 100000
		2018030101 / 100000 / 20180301 / 입금 / 200000
		총 2건
		*/
		
		System.out.println("계좌번호 > 2018030101");
		System.out.println("내역 출력시작일 > 20171015");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 금액 / 입출금일 / 구분 / 잔액");
		for(AccountHistory h : his) {
			System.out.println(h);
		}
	
	}
}
