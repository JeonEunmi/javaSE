package com.test049.bank2;

import java.util.Scanner;

// �׼� Ŭ����
// -> ���� �޴��� �׼� �޼ҵ� ����
public class SubMain {
	
	// Bank Ŭ������ ��ü(instance) ����
	// ->field
	private Bank bank = new Bank();
	
	// ���� �����ϱ�
	// -> �������� �׼Ǹ����� ���� ��ü ����
	public void createAccount(Scanner scanner) {
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");
		System.out.print("���¹�ȣ(B****): ");
		String ano = scanner.nextLine();
		System.out.print("������ : ");
		String owner = scanner.nextLine();
		System.out.print("�ʱ� �Աݾ� : ");
		int balance = scanner.nextInt();
		scanner.nextLine();
		
		// ����ҿ� �ڷ� �����ϴ� �׼� �ʿ� -> Bank ��ü�� Ư�� �޼ҵ� ȣ��� ��ü
		this.bank.createAccount(new Account(ano, owner, balance));
		
		this.bank.createAccount(new Account());
		
		System.out.println("--------------------------------------------------");
		System.out.println("���°� �����Ǿ����ϴ�.");
		System.out.println();
	}
	
	// ���� ��Ϻ���
	public void accountList() {
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");

		// �迭 ����ҿ� ����� Account ��ü ����� ���� �޾Ƽ� ���
		// -> ī���� ��� ���
		Account[] list = this.bank.accountList();
		int count = list.length;
		for (Account i : list) {
			// toString() �޼ҵ�� ���� ����
			System.out.println(i);
		}
		
		System.out.println("--------------------------------------------------");
		System.out.println("�� ���¸�� : " + count + "��");
	}
	
	// �����ϱ�
	public void deposit(Scanner scanner) {

		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");

		System.out.print("�Ա��Ͻ� ���� ��ȣ�� �Է����ּ���. > ");
		String ano = scanner.nextLine();

		System.out.print("���ݾ� : ");
		int money = scanner.nextInt();
		scanner.nextLine();
		
		
		if(money < Bank.MIN_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("�߸��� �ݾ��� �Է��ϼ̽��ϴ�. �ּ� 0�� �̻� �Ա� ����");
		} else if (money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("�Ա� ����. 1ȸ ���� �Ѿ� �ѵ��� 100���� �Դϴ�.");
		} else {
			System.out.println("--------------------------------------------------");
			System.out.println("�Ա� ����!");
		}
		
		System.out.println("���� �ܾ� : " + this.bank.deposit(new Account(ano, null, money)));
		System.out.println();
	}
	
	// ����ϱ�
	public void withdraw(Scanner scanner) {
		
		System.out.println();
		System.out.println("==================================================");
		System.out.println("                ��   ��   ��   ��                 ");
		System.out.println("==================================================");

		System.out.print("����Ͻ� ���� ��ȣ�� �Է����ּ���. > ");
		String ano = scanner.nextLine();

		System.out.print("��ݾ� : ");
		int money = scanner.nextInt();
		scanner.nextLine();
		
		int temp = this.bank.withdraw(new Account(ano, null, money));
		
		if (temp - money < 0) {
			System.out.println("--------------------------------------------------");
			System.out.println("�ܰ� �����մϴ�.");
		} else if(money < Bank.MIN_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("�߸��� �ݾ��� �Է��ϼ̽��ϴ�. �ּ� 0�� �̻� ��� ����");
		} else if (money > Bank.MAX_BALANCE) {
			System.out.println("--------------------------------------------------");
			System.out.println("��� ����. 1ȸ ��� �Ѿ� �ѵ��� 100���� �Դϴ�.");
		} else {
			System.out.println("--------------------------------------------------");
			System.out.println("��� ����!");
		}
		
		System.out.println("���� �ܾ� : " + temp);
		System.out.println();
	}
	
}
