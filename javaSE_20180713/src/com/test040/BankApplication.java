package com.test040;

import java.util.Scanner;

public class BankApplication {

	private Account account = new Account();

	// �ڷ� ����� ��ü ���� -> (instance) field�θ� ����
	// -> �迭 (�Ǵ� �÷���, ������ ���̽�) �����
	// -> �迭 ����Ҵ� ũ������� ������ �ֱ� ������,
	// ũ�� ������ ���� �ؼҸ� ���ؼ� �迭����� Ȯ���� �ʿ��ϴ�.
	private Account[] accountArray = new Account[10];

	// �ڷ� ����� �ʱ�ȭ
	// -> ������
	// -> ���� ���� �� ���� ����ҿ� ����

	// ���»��� -> �ܺο��� ���޵Ǵ� �ڷ� ���� �������� �׼Ǹ����� ���� ��ü ���� �� ����� ����
	public void createAccount(Scanner scanner) {
		// �ܼ� �׼� -> Scanner ��ü �ʿ�
	}

	// ���¸��
	public void accountList() {

	}

	// �����ϱ�
	public void deposit(Scanner scanner) {
		// �ܼ� �׼� -> Scanner ��ü �ʿ�
	}

	// ����ϱ�
	public void withdraw(Scanner scanner) {
		// �ܼ� �׼� -> Scanner ��ü �ʿ�
	}

	// Account ��ü ã�� -> ���θ޴� �� ������� ���� �޼ҵ� (private method)
	private Account findAccount(String ano) {
		return null;
	}
}
