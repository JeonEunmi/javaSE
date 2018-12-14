package com.bankAccount.service;

import com.bankAccount.domain.AccountList;
import com.bankAccount.persistance.AccountDAO;
import java.util.*;

// 사용자용 서브 메인
public class OwnerSubMain {

	// 1.계좌조회 2.계좌입금 3.계좌출금

	// 주의)
	// 여기서 new AccountDAO() 하지 않는다.
	// Main 클래스 main() 메소드에서 객체 생성된 AccountDAO를 전달 받아서 공유해야 한다.
	// 기본 생성자 삭제
	private AccountDAO dao;

	public OwnerSubMain(AccountDAO dao) {
			this.dao = dao;
	}

	public OwnerSubMain() {
		// 역직렬화 진행
	}

	// 1.계좌조회
	public void accountSearch(Scanner sc) {

		System.out.println();

		System.out.print("계좌번호 > ");
		String accountId = sc.nextLine();
		System.out.println();
		System.out.printf("(%s)님의 계좌 목록%n", accountId);
		System.out.println("===========================================================================");
		System.out.println("계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호");

		List<AccountList> list = this.dao.accountIDSearch(accountId);

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================================================");
		System.out.printf("총 %d 건%n", list.size());

		System.out.println();

	}

	// 2. 계좌입금
	public void accountIn(Scanner sc) {
		System.out.println("계좌입금 작업을 진행합니다.");
		System.out.print("계좌번호> ");
		String accountId = sc.nextLine();
		System.out.print("입금액> ");
		int money = sc.nextInt();
		sc.nextLine();

		int result = this.dao.accountHistoryAdd(accountId, money);

		if (result == 1) {
			System.out.println("계좌입금 작업이 완료했습니다.");
		} else {
			System.out.println("계좌입금 작업이 실패했습니다. 존재하지 않는 계좌");
		}
	}

	// 3. 계좌출금
	public void accountOut(Scanner sc) {
		System.out.println("계좌출금 작업을 진행합니다.");
		System.out.print("계좌번호> ");
		String accountId = sc.nextLine();
		System.out.print("출금액> ");
		int money = sc.nextInt();
		sc.nextLine();
		System.out.print("비밀번호> ");
		String pw = sc.nextLine();

		int result = this.dao.accountHistoryWithdraw(accountId, money, pw);

		if (result == 2) {
			System.out.println("계좌출금 작업이 완료되었습니다.");
		} else if (result == 1) {
			System.out.println("패스워드가 틀렸습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void serializable() {
		
		this.dao.serializable();
		
	}
	
	public void reSerializable() {
		this.dao.reSerializable();
	}


}
