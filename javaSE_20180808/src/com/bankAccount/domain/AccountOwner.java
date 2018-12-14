package com.bankAccount.domain;

import java.io.Serializable;

//�ڷ��� Ŭ���� ����
public class AccountOwner implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4128840452119194315L;
	// �ڷ� �׸� ���� �ʵ� ����
	// ->�����ְ�����ȣ, �̸�, ��ȭ��ȣ
	private String accountOwnerId;
	private String name;
	private String phone;
	
	// ������ -> �⺻ ������, �Ű����� �ִ� ������
	public AccountOwner() {

	}
	
	//getter, setter
	public AccountOwner(String accountOwnerId, String name, String phone) {
		this.accountOwnerId = accountOwnerId;
		this.name = name;
		this.phone = phone;
	}

	public String getAccountOwnerId() {
		return this.accountOwnerId;
	}

	public void setAccountOwnerId(String accountOwnerId) {
		this.accountOwnerId = accountOwnerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}