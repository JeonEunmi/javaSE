package com.bankAccount.persistance;

import java.util.ArrayList;
import java.util.List;

import com.bankAccount.domain.Account;
import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.domain.AccountOwner;

// 자료 저장소 운영 클래스
public class AccountDAO {

	// List 컬렉션 저장소
	List<Account> account = new ArrayList<Account>();
	List<AccountHistory> accountHistory = new ArrayList<AccountHistory>();
	List<AccountOwner> accountOwner = new ArrayList<AccountOwner>();

	public AccountDAO() {
		// 초기 샘플 데이터 준비
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 비밀번호 / 계좌주 고유 번호
		// 2018030101 / 200000 / 20171010 / 20180101 / 1234 / A0001
		this.account.add(new Account("2018030101", "A0001", 0, "20171010", "1234", "20180101"));

		// 계좌주 고유 번호 / 계좌주 / 전화번호
		// A0001 / 박길동 / 010-5678-1234
		this.accountOwner.add(new AccountOwner("A0001", "박길동", "010-5678-1234"));

		// 계좌번호 / 금액 / 입출금일 / 구분 / 잔액
		// 2018030101 / 100000 / 20171010 / 입금 / 100000
		// 2018030101 / 100000 / 20180101 / 입금 / 200000
		this.accountHistory.add(new AccountHistory("2018030101", 100000, "20171010", "입금", 100000));
		this.accountHistory.add(new AccountHistory("2018030101", 100000, "20180101", "입금", 200000));

	}

	// 계좌조회 메소드 추가
	// 계좌번호 기준
	public List<AccountList> accountIDSearch(String value) {

		List<AccountList> list = new ArrayList<AccountList>();
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
		for (Account a : this.account) {
			AccountOwner owner = this.personalIDSearch(a.getAccountOwnerId());
			if (a.getAccountId().equals(value)) {
				list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(),
						a.getLastUpdateDate(), owner.getName(),
						owner.getPhone()));
			}
		}
		return list;
	}

	// 계좌조회 메소드 추가
	// 계좌주 이름 / 전화번호 기준
	public List<AccountList> accountPersonalSearch(String name, String phone) {

		List<AccountList> list = new ArrayList<AccountList>();
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
		for (Account a : this.account) {
			AccountOwner owner = this.personalIDSearch(a.getAccountOwnerId());
			if (owner != null && owner.getName().equals(name) && owner.getPhone().equals(phone)) {
				list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(),
						a.getLastUpdateDate(), owner.getName(),
						owner.getPhone()));
			}
		}
		return list;
	}

	// 계좌조회 메소드 추가
	// 전체
	public List<AccountList> accountAllSearch() {

		List<AccountList> list = new ArrayList<AccountList>();
		// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호

		for (Account a : this.account) {
			list.add(new AccountList(a.getAccountId(), a.getBalance(), a.getAccountCreateDate(), a.getLastUpdateDate(),
					this.personalIDSearch(a.getAccountOwnerId()).getName(),
					this.personalIDSearch(a.getAccountOwnerId()).getPhone()));
		}
		return list;
	}

	// 계좌주 정보 조회 메소드 추가
	// -> 계좌주 고유 번호 기준
	public AccountOwner personalIDSearch(String value) {

		AccountOwner tmp = null;

		for (AccountOwner a : accountOwner) {

			if (a.getAccountOwnerId().equals(value)) {
				tmp = a;
			}
		}

		return tmp;

	}

	// 계좌입출금내역 출력 메소드 추가
	// ->계좌번호 기준 + 내역출력시작일 이후
	public List<AccountHistory> accountIOPrint(String accountid, String value) { 
		
		List<AccountHistory> tmp = new ArrayList<AccountHistory>();
		
		for(AccountHistory h : accountHistory) {
			if(h.getAccountId().equals(accountid) && h.getCreateDate().compareTo(value) >= 0) {
				tmp.add(h);
			}
		}
		
		
		return tmp;

	}

}
