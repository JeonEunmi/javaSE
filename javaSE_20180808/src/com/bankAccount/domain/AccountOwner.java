package com.bankAccount.domain;

import java.io.Serializable;

//자료형 클래스 선언
public class AccountOwner implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4128840452119194315L;
	// 자료 항목에 따른 필드 구성
	// ->계좌주고유번호, 이름, 전화번호
	private String accountOwnerId;
	private String name;
	private String phone;
	
	// 생성자 -> 기본 생성자, 매개변수 있는 생성자
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