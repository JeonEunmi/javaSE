package com.bankAccount.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.persistance.AccountDAO;

// 액션 테스트용 클래스
public class Test {

	public static void main(String[] args) {
		
		AccountDAO dao = new AccountDAO();
		
		
		List<AccountList> list2 = new ArrayList<AccountList>(dao.accountIDSearch("2018030101"));
		
		List<AccountList> list3 = new ArrayList<AccountList>(dao.accountPersonalSearch("박길동", "010-5678-1234"));
		
		
		// 계좌조회 메소드 테스트
		// -> 전체
		/*
		전체계좌 목록
		--------------------------------------------         
		계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
		2017101001 / 200000 / 20171010 / 20180101 / 박길동 / 010-5678-1234
		총 1건
		*/
/*
		System.out.println("전체계좌 목록");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");
		for(AccountList a : list) {
			System.out.println(a);
		}
		System.out.printf("총 %d 건 %n", list.size());
		
		*/
/*		
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
		
		계좌번호>2018030101
		내역출력시작일>20171010
		(2018030101)님의 계좌입출금내역
		--------------------------------------------
		계좌번호 / 금액 / 입출금일 / 구분 / 잔액 
		2018030101 / 100000 / 20171010 / 입금 / 100000
		2018030101 / 100000 / 20180301 / 입금 / 200000
		총 2건
		
		
		System.out.println("계좌번호 > 2018030101");
		System.out.println("내역 출력시작일 > 20171015");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 금액 / 입출금일 / 구분 / 잔액");
		
		for(AccountHistory h : his) {
			System.out.println(h);
		}*/
		
/*		System.out.println("******************");
		System.out.println("*******입금*******");
		System.out.println("******************");
		
		
		String accountId = "2018030101";
		int money = 100000;
		int result = dao.accountHistoryAdd(accountId, money);
		if(result == 1) {
			System.out.println("계좌입금 작업이 완료했습니다.");
		} else {
			System.out.println("계좌입금 작업이 실패했습니다. 존재하지 않는 계좌");
		}
	
		
		List<AccountHistory> his = dao.accountIOPrint("2018030101", "20171015");
	
		System.out.println("계좌번호 > 2018030101");
		System.out.println("내역 출력시작일 > 20171015");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 금액 / 입출금일 / 구분 / 잔액");

		for(AccountHistory h : his) {
			System.out.println(h);
		}
		
		

		System.out.println("******************");
		System.out.println("*******출금*******");
		System.out.println("******************");
		
		String accountId1 = "2018030101";
		int money1 = 400000;
		String pw = "1234";
		System.out.println("출금계좌 : " + accountId1 + "출금액 : " + money1 + "패스워드 : " + pw);
		int result1 = dao.accountHistoryWithdraw(accountId1, money1, pw);
		
		List<AccountHistory> his1 = dao.accountIOPrint("2018030101", "20171015");
		
		if(result1 == 2) {
			System.out.println("계좌출금 작업이 완료했습니다.");
		} else if(result1 == 1){
			System.out.println("패스워드가 틀렸습니다.");
		} else if(result1 == 0) {
			System.out.println("계좌출금 작업이 실패했습니다.(잔액부족)");			
		}
		
		for(AccountHistory h : his1) {
			System.out.println(h);
		}*/

		
		String accountId0 = "2018030101";
		String pw0 = "1234";
		int balance = 10000;
		// 기존 사용자의 추가 계좌 등록
		String accountOwnerId = "A0001"; // 박길동
		
		dao.newAccountAdd(accountId0, pw0, balance, accountOwnerId);
	
		List<AccountList> list = new ArrayList<AccountList>(dao.accountAllSearch());
		//신규 사용자의 추가 계좌 등록
		// -> 계좌정보, 사용자정보 모두 등록해야한다.
		System.out.println("전체계좌 목록");
		System.out.println("--------------------------------------------");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");
		for(AccountList a : list) {
			System.out.println(a);
		}
		System.out.printf("총 %d 건 %n", list.size());

	}
}
