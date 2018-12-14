package com.bankAccount.domain;

import java.io.Serializable;

//�ڷ��� Ŭ���� ����
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2737694383058425777L;
	// �ڷ� �׸� ���� �ʵ� ����
	// ->���¹�ȣ, �����ְ�����ȣ, �����ܾ�, ���»�����, ��й�ȣ, �������ŷ���
	private String accountId;
	private String accountOwnerId;
	private int balance;
	private String accountCreateDate;
	private String pw;
	private String lastUpdateDate;
	
	
	// ������ -> �⺻ ������, �Ű����� �ִ� ������
	public Account() {

	}

	public Account(String accountId, String accountOwnerId, int balance, String accountCreateDate, String pw,
			String lastUpdateDate) {
		this.accountId = accountId;
		this.accountOwnerId = accountOwnerId;
		this.balance = balance;
		this.accountCreateDate = accountCreateDate;
		this.pw = pw;
		this.lastUpdateDate = lastUpdateDate;
	}


	//getter, setter
	public String getAccountId() {
		return this.accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public String getAccountOwnerId() {
		return this.accountOwnerId;
	}


	public void setAccountOwnerId(String accountOwnerId) {
		this.accountOwnerId = accountOwnerId;
	}


	public int getBalance() {
		return this.balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public String getAccountCreateDate() {
		return this.accountCreateDate;
	}


	public void setAccountCreateDate(String accountCreateDate) {
		this.accountCreateDate = accountCreateDate;
	}


	public String getPw() {
		return this.pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getLastUpdateDate() {
		return this.lastUpdateDate;
	}


	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	

}
