package com.bankAccount.domain;

import java.io.Serializable;

// ��� ���� �ڷ��� Ŭ����
public class AccountList implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4194804980346129687L;
	// ���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ
	
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
