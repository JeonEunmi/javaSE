package com.bankAccount.domain;

//자료형 클래스 선언
public class AccountHistory {
	
	// 자료 항목에 따른 필드 구성
	// ->계좌번호, 입출금액, 입출금일, 입출금구분, 잔액
	private String accountId;
	private int money;
	private String createDate;
	private String status;
	private int balance;
	
	// 생성자 -> 기본 생성자, 매개변수 있는 생성자
	public AccountHistory() {
	
	}

	public AccountHistory(String accountId, int money, String createDate, String status, int balance) {
		this.accountId = accountId;
		this.money = money;
		this.createDate = createDate;
		this.status = status;
		this.balance = balance;
	}

	//getter, setter
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public int getMoney() {
		return this.money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

		
	
	//toString()
	@Override
	public String toString() {
		return String.format("%s / %s / %s / %s / %s", this.getAccountId(), this.getMoney()
				, this.getCreateDate(), this.getStatus(), this.getBalance());
	}

}
