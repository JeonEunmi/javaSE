package com.test049.bank2;

public class Account {

	// Account가 가질 항목 분석
	// ->field, getter, setter, toString(), constructor 구성

	private String ano;
	private String owner;
	private int balance;

	public Account() {
		// 기본생성자
	}

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// 계좌번호는 읽기 전용
	public String getAno() {
		return this.ano;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String toString() {
		String result = "";
		result = String.format("계좌번호 : %s | 계좌주 : %s | 잔액 : %s", this.getAno(), this.getOwner(), this.getBalance());
		return result;
	}

}
