package com.test040;

public class Account {

	// Account�� ���� �׸� �м�
	// ->field, getter, setter, toString(), constructor ����

	private String ano;
	private String owner;
	private int balance;

	public Account() {
		// �⺻������
	}

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	// ���¹�ȣ�� �б� ����
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
		result = String.format("%s | %s | %s", this.getAno(), this.getOwner(), this.getBalance());
		return result;
	}

}
