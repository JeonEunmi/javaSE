package com.test.ex;

import java.util.*;
public class Bank {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	

	// �ڷ� ����� ��ü ���� -> (instance) field�θ� ����
	// -> �迭 (�Ǵ� �÷���, ������ ���̽�) �����
	// -> �迭 ����Ҵ� ũ������� ������ �ֱ� ������,
	// ũ�� ������ ���� �ؼҸ� ���ؼ� �迭����� Ȯ���� �ʿ��ϴ�.
	private Account[] accountArray = new Account[10];

	// �迭 �ε��� ������ �ӽ� ���� -> field
	private int idx;

	// �ڷ� ����� �ʱ�ȭ
	// -> �ν��Ͻ� �ʱ�ȭ : �⺻������ , static �ʱ�ȭ : �ʱ�ȭ ���
	// -> ���� ���� �� ��(B0001, HONG, 10)�� ����ҿ� ����
	public Bank() {
		this.accountArray[this.idx] = new Account("B0001", "HONG", 10);
	}

	// ���»��� -> �ܺο��� ���޵Ǵ� �ڷ� ���� �������� �׼Ǹ����� ���� ��ü ���� �� ����� ����
	public void createAccount(Scanner sc) {
		// �ܼ� �׼� -> sc ��ü �ʿ�
		++this.idx;
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");
		System.out.print("���¹�ȣ(B****): ");
		String ano = sc.nextLine();
		System.out.print("������ : ");
		String owner = sc.nextLine();
		System.out.print("�ʱ� �Աݾ� : ");
		int balance = sc.nextInt();
		sc.nextLine();
		
		// ���� ����Ұ� ������ ��� ����� Ȯ��
		// private method Ȯ��

		this.accountArray[this.idx] = new Account(ano, owner, balance);

		System.out.println("--------------------------------------------------");
		System.out.println("���°� �����Ǿ����ϴ�.");
		System.out.println();
	}

	// ���¸��
	public void accountList() {

		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");

		// �迭 ����ҿ� ����� Account ��ü ����� ���
		// -> �迭 ����ҿ��� �ڷ�(Account ��ü)�� ����Ȱ�츸 ��µǵ��� �Ѵ�.
		// -> ī���� ��� ���
		// -> ī���� ����� ������ �迭 �ε����� ��� ����
		int count = 0;
		for (Account i : this.accountArray) {
			// toString() �޼ҵ�� ���� ����
			if (i != null) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("--------------------------------------------------");
		System.out.println("�� ���¸�� : " + count + "��");
		System.out.println();

		// ī���� ����� �迭 �ε��� ������ ����
		this.idx = count;
	}

	// �����ϱ�
	public void deposit(Scanner sc) {

		// 1. ���¹�ȣ ���� -> �ܼ� �׼�
		// 2. �Աݾ� ���� -> �ܼ� �׼�
		// 3. Account ��ü ã�� -> private method findAcoount ȣ�� -> Ư�� Account ��ü�� �����ּ� ��ȯ
		// 4. Ư�� Account ��ü�� balance ����� �ݾ�(getter)�� + ���� ���� -> setter ȣ��
		// 5. �޽��� ��� -> "��� : �Ա� ����!"

		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");
		
		System.out.print("�Ա��Ͻ� ���� ��ȣ�� �Է����ּ���. > ");
		String ano = sc.nextLine();

		System.out.print("���ݾ� : ");
		int money = sc.nextInt();
		sc.nextLine();

		Account a = findAccount(ano);
		
		if(money < Bank.MIN_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("�߸��� �ݾ��� �Է��ϼ̽��ϴ�. �ּ� 0�� �̻� �Ա� ����");
			System.out.println("�Ա� ����!");
		} else if(money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("�Ա� ����. 1ȸ ���� �Ѿ� �ѵ��� 100���� �Դϴ�.");
		} else {
			a.setBalance((a.getBalance()) + money);	
			System.out.println("--------------------------------------------------");
			System.out.println("�Ա� ����!");
		}
		
		System.out.println("���� �ܾ� : " + a.getBalance());
		System.out.println();

	}

	// ����ϱ�
	public void withdraw(Scanner sc) {
		// �ܼ� �׼� -> sc ��ü �ʿ�
		
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");
		
		System.out.print("����Ͻ� ���� ��ȣ�� �Է����ּ���. > ");
		String ano = sc.nextLine();

		System.out.print("��ݾ� : ");
		int money = sc.nextInt();
		sc.nextLine();

		Account a = findAccount(ano);
		if(a.getBalance() - money < 0) {
			System.out.println("--------------------------------------------------");
			System.out.println("�ܰ� �����մϴ�.");
		} else if(money < Bank.MIN_BALANCE){
			System.out.println("--------------------------------------------------");
			System.out.println("�߸��� �ݾ��� �Է��ϼ̽��ϴ�. �ּ� 0�� �̻� ��� ����");
		} else if(money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("��� ����. �ִ� 100���������� ��ݰ����մϴ�.");
		}
		else {
		a.setBalance((a.getBalance()) - money);
		System.out.println("--------------------------------------------------");
		System.out.println("��� ����!");
		}
		
		System.out.println("���� �ܾ� : " + a.getBalance());
		System.out.println();

	}

	// Account ��ü ã�� -> ���θ޴� �� ������� ���� �޼ҵ� (private method)
	private Account findAccount(String ano) {

		Account result = null;

		// �ݺ��� �׼�
		// ->���޹��� ano�� ��ġ�ϴ� ano�� ���� Ư�� ��ü Ž��
		for(Account a : accountArray) {
			if (a != null && ano.equals(a.getAno())) {
				result = a;
		}
		

		}

		return result;
	}

}
