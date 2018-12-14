package com.test049.bank2;

import java.util.Scanner;

// �׼� Ŭ����

// -> �ڷ� ����� ��ü ��� �ۼ��Ѵ�.
public class Bank {

	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;

	private Account account = new Account();

	// �ڷ� ����� ��ü ���� -> (instance) field�θ� ����
	// -> �迭 (�Ǵ� �÷���, ������ ���̽�) �����
	// -> �迭 ����Ҵ� ũ������� ������ �ֱ� ������,
	// ũ�� ������ ���� �ؼҸ� ���ؼ� �迭����� Ȯ���� �ʿ��ϴ�.
	private Account[] accountArray = new Account[10];

	// �迭 �ε��� ������ �ӽ� ���� -> field
	// ->�迭 ����ҿ� ����� Account ��ü�� ī���� ����
	private int idx;

	// �ڷ� ����� �ʱ�ȭ
	// -> �ν��Ͻ� �ʱ�ȭ : �⺻������ , static �ʱ�ȭ : �ʱ�ȭ ���
	// -> ���� ���� �� ��(B0001, HONG, 10)�� ����ҿ� ����
	public Bank() {
		this.accountArray[this.idx] = new Account("B0001", "HONG", 10);
		++this.idx;
	}

	// ���»����ϱ�
	// -> �ܺο��� ���޹��� �ڷ�(Account ��ü)�� ����ҿ� ����
	public void createAccount(Account account) {

		this.accountArray[this.idx] = account;
		++this.idx;

		// ������ �迭 ����Ұ� ���ڶ� ���
		// ����� Ȯ�� �׼� ȣ��
		// -> private method
	}

	// ���¸��
	public Account[] accountList() {

		// �迭 ����ҿ� �ִ� ��Ͽ���
		// null�� ������ Account ��ü�� ������ �迭�� ���� �� ��ȯ
		Account[] list = new Account[this.idx];
		for (int i = 0, j = 0; i < this.idx; i++) {
			if (this.accountArray[i] != null) {
				// (������ �̹Ƿ�)���� ���� -> ���� �ּҸ� ����
				list[j] = this.accountArray[i];
				++j;
			}
		}
		return list;
	}

	// �����ϱ�
	public int deposit(Account account) {

		// 1. ���¹�ȣ ���� -> �ܼ� �׼�
		// 2. �Աݾ� ���� -> �ܼ� �׼�
		// 3. Account ��ü ã�� -> private method findAcoount ȣ�� -> Ư�� Account ��ü�� �����ּ� ��ȯ
		// 4. Ư�� Account ��ü�� balance ����� �ݾ�(getter)�� + ���� ���� -> setter ȣ��
		// 5. �޽��� ��� -> "��� : �Ա� ����!"

		Account a = findAccount(account.getAno());

		if (account.getBalance() < Bank.MIN_BALANCE || account.getBalance() > Bank.MAX_BALANCE) {

		} else {
			a.setBalance((account.getBalance() + a.getBalance()));
		}
		int result = a.getBalance();
		return result;

	}

	// ����ϱ�
	public int withdraw(Account account) {
		// �ܼ� �׼� -> Scanner ��ü �ʿ�
		Account a = findAccount(account.getAno());

		if (account.getBalance() < Bank.MIN_BALANCE || account.getBalance() > Bank.MAX_BALANCE || a.getBalance() - account.getBalance() < 0) {
		} else {
			a.setBalance((a.getBalance() - account.getBalance()));
		}
		int result = a.getBalance();
		return result;

	}

	// Account ��ü ã�� -> ���θ޴� �� ������� ���� �޼ҵ� (private method)
	private Account findAccount(String ano) {

		Account result = null;

		// �ݺ��� �׼�
		// ->���޹��� ano�� ��ġ�ϴ� ano�� ���� Ư�� ��ü Ž��
		for (Account a : accountArray) {
			if (a != null && ano.equals(a.getAno())) {
				result = a;
			}

		}

		return result;
	}

}
