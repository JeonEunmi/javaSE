package com.bankAccount.domain;

//�ڷ��� Ŭ���� ����
public class AccountHistory {
	
	// �ڷ� �׸� ���� �ʵ� ����
	// ->���¹�ȣ, ����ݾ�, �������, ����ݱ���, �ܾ�
	private String accountId;
	private int money;
	private String createDate;
	private String status;
	private int balance;
	
	// ������ -> �⺻ ������, �Ű����� �ִ� ������
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
