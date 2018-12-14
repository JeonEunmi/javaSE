package com.bankAccount.domain;

// 출력 서식 자료형 클래스
public class AccountList {

	// 계좌번호 / 잔액 / 계좌생성일 / 마지막거래일 / 계좌주 / 전화번호
	
	private String accountId;
	private int balance;
	private String accountCreateDate;
	private String lastUpdateDate;
	private String name;
	private String phone;
	
	public AccountList() {

	}

	public AccountList(String accountId, int balance, String accountCreateDate, String lastUpdateDate, String name,
			String phone) {
		this.accountId = accountId;
		this.balance = balance;
		this.accountCreateDate = accountCreateDate;
		this.lastUpdateDate = lastUpdateDate;
		this.name = name;
		this.phone = phone;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public int getBalance() {
		return this.balance;
	}

	public String getAccountCreateDate() {
		return this.accountCreateDate;
	}

	public String getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public String getName() {
		return this.name;
	}


	public String getPhone() {
		return this.phone;
	}


	@Override
	public String toString() {
		return String.format("%s / %s / %s / %s / %s / %s ", this.getAccountId(), this.getBalance()
				, this.getAccountCreateDate(), this.getLastUpdateDate(), this.getName(), this.getPhone());
		
	}
	
	
	
	
}
