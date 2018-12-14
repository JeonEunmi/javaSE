package com.bankAccount.service;

import com.bankAccount.domain.AccountList;
import com.bankAccount.persistance.AccountDAO;
import java.util.*;

// ����ڿ� ���� ����
public class OwnerSubMain {

	// 1.������ȸ 2.�����Ա� 3.�������

	// ����)
	// ���⼭ new AccountDAO() ���� �ʴ´�.
	// Main Ŭ���� main() �޼ҵ忡�� ��ü ������ AccountDAO�� ���� �޾Ƽ� �����ؾ� �Ѵ�.
	// �⺻ ������ ����
	private AccountDAO dao;

	public OwnerSubMain(AccountDAO dao) {
			this.dao = dao;
	}

	public OwnerSubMain() {
		// ������ȭ ����
	}

	// 1.������ȸ
	public void accountSearch(Scanner sc) {

		System.out.println();

		System.out.print("���¹�ȣ > ");
		String accountId = sc.nextLine();
		System.out.println();
		System.out.printf("(%s)���� ���� ���%n", accountId);
		System.out.println("===========================================================================");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ");

		List<AccountList> list = this.dao.accountIDSearch(accountId);

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================================================");
		System.out.printf("�� %d ��%n", list.size());

		System.out.println();

	}

	// 2. �����Ա�
	public void accountIn(Scanner sc) {
		System.out.println("�����Ա� �۾��� �����մϴ�.");
		System.out.print("���¹�ȣ> ");
		String accountId = sc.nextLine();
		System.out.print("�Աݾ�> ");
		int money = sc.nextInt();
		sc.nextLine();

		int result = this.dao.accountHistoryAdd(accountId, money);

		if (result == 1) {
			System.out.println("�����Ա� �۾��� �Ϸ��߽��ϴ�.");
		} else {
			System.out.println("�����Ա� �۾��� �����߽��ϴ�. �������� �ʴ� ����");
		}
	}

	// 3. �������
	public void accountOut(Scanner sc) {
		System.out.println("������� �۾��� �����մϴ�.");
		System.out.print("���¹�ȣ> ");
		String accountId = sc.nextLine();
		System.out.print("��ݾ�> ");
		int money = sc.nextInt();
		sc.nextLine();
		System.out.print("��й�ȣ> ");
		String pw = sc.nextLine();

		int result = this.dao.accountHistoryWithdraw(accountId, money, pw);

		if (result == 2) {
			System.out.println("������� �۾��� �Ϸ�Ǿ����ϴ�.");
		} else if (result == 1) {
			System.out.println("�н����尡 Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	public void serializable() {
		
		this.dao.serializable();
		
	}
	
	public void reSerializable() {
		this.dao.reSerializable();
	}


}
