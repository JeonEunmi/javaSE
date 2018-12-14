package com.bankAccount.service;

import java.util.List;
import java.util.Scanner;

import com.bankAccount.domain.Account;
import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.domain.AccountOwner;
import com.bankAccount.persistance.AccountDAO;

// �����ڿ� ���� ����
public class AdminSubMain {

	// ����)
	// ���⼭ new AccountDAO() ���� �ʴ´�.
	// Main Ŭ���� main() �޼ҵ忡�� ��ü ������ AccountDAO�� ���� �޾Ƽ� �����ؾ� �Ѵ�.
	// �⺻ ������ ����
	
	private AccountDAO dao;
	
	public AdminSubMain(AccountDAO dao) {
		this.dao = dao;
		//������ȭ ����
		this.dao.reSerializable();
	}

	// ������ ��й�ȣ ��� ���� ���� ����
	private static String pw = "9090";

	public static String getPw() {
		return pw;
	}

	public static void setPw(String pw) {
		AdminSubMain.pw = pw;
	}

	// 1.���»��� 2.������ȸ 3.��������ݳ��� 4.��й�ȣ ���� 0.����
	public void main(Scanner sc) {
		// ��й�ȣ Ȯ�� ���� �߰�
		System.out.println("������ ���� ȭ������ �̵��մϴ�.");
		System.out.print("�����ں�й�ȣ>");
		String pw = sc.nextLine();
		if (pw.equals(AdminSubMain.getPw())) {
			this.adminSub(sc);
		} else {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}

	public void adminSub(Scanner sc) {

		while (true) {
			try {
				System.out.println();
				System.out.println("**���°��� v1.0_������**");
				System.out.println("1.���»��� 2.������ȸ 3.��������ݳ��� 4.��й�ȣ���� 5.����");
				System.out.print("����> ");

				int selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 5 || selectNum == 0) {
					System.out.println("�Ϲ� ����� ȭ������ �̵��մϴ�.");
					break;
				}

				switch (selectNum) {

				case 1:
					this.accountAdd(sc);
					break;
				case 2:
					this.accountSearch(sc);
					break;
				case 3:
					this.accountIO(sc);
					break;
				case 4:
					this.pwRevise(sc);
					break;
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("�߸��� �׼��Դϴ�.");
				sc.nextLine();
				// e.printStackTrace();
			}

		}

	}

	// 1.���»���
	private void accountAdd(Scanner sc) {
		System.out.println();
		System.out.println("���»��� �۾��� ���� ������ȸ�� ���� �����մϴ�.");
		System.out.print("�̸�> ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ> ");
		String phone = sc.nextLine();

		System.out.println();
		System.out.printf("(%s/%s)���� ���¸��%n", name, phone);
		System.out.println("============================================");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / ������ / ��ȭ��ȣ");
		
		List<AccountList> list = this.dao.accountPersonalSearch(name, phone);
		
		System.out.println("============================================");

		if (list.isEmpty()) {
			System.out.println("��� ����� �����ϴ�.");
		} else {
			for (AccountList al : list) {
				System.out.println(al);
			}
		}
		System.out.printf("�� %d��%n", list.size());

		System.out.println();

		System.out.print("�ű� ���¸� ����ұ��? (Y/N)> ");

		String accountId = "";
		String pw = "";
		int balance = 0;

		AccountOwner ao = this.dao.personalSearch(name, phone);

		String accountOwnerId = "";

		if (ao == null) {
			accountOwnerId = this.dao.newAccountOwnerId();
			this.dao.newOwnerAdd(accountOwnerId, name, phone);
		} else {
			accountOwnerId = ao.getAccountOwnerId();
		}

		String select = sc.nextLine();

		if (select.equalsIgnoreCase("y")) {

			System.out.print("���¹�ȣ > ");
			accountId = sc.nextLine();

			System.out.print("��й�ȣ > ");
			pw = sc.nextLine();

			System.out.print("�ʱ��Աݾ� > ");
			balance = sc.nextInt();

			this.dao.newAccountAdd(accountId, pw, balance, accountOwnerId);

			System.out.println("*");
			System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("���� ���� ���");
		}
		System.out.println();

	}

	// 2.������ȸ
	private void accountSearch(Scanner sc) {

		while (true) {

			try {
				System.out.println();
				System.out.println("**���°��� v1.0_������** > 2.������ȸ");
				System.out.println("1.��ü���� 2.���¹�ȣ 3.������ 4.����");
				System.out.print("����> ");

				int selectNum = sc.nextInt();
				sc.nextLine();

				if (selectNum == 4 || selectNum == 0) {
					break;
				}

				switch (selectNum) {

				case 1:
					this.accountSearch_sub1();
					break;
				case 2:
					this.accountSearch_sub2(sc);
					break;
				case 3:
					this.accountSearch_sub3(sc);
					break;
				case 4:
					break;
				}
			} catch (Exception e) {
				System.out.println("�߸��� �׼��Դϴ�.");
				sc.nextLine();
				// e.printStackTrace();
			}
		}

	}

	private void accountSearch_sub1() {
		System.out.println();

		System.out.println("��ü���� ���");
		System.out.println("===========================================================================");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ");

		List<AccountList> list = this.dao.accountAllSearch();

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.printf("�� %d ��%n", list.size());

		System.out.println();
	}

	private void accountSearch_sub2(Scanner sc) {

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

	private void accountSearch_sub3(Scanner sc) {
		System.out.println();

		System.out.print("������ > ");
		String accountName = sc.nextLine();

		System.out.print("��ȭ��ȣ > ");
		String accountphone = sc.nextLine();
		System.out.println();
		System.out.printf("(%s/ %s)���� ���� ���%n", accountName, accountphone);
		System.out.println("===========================================================================");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ");

		List<AccountList> list = this.dao.accountPersonalSearch(accountName, accountphone);

		for (AccountList result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================================================");
		System.out.printf("�� %d ��%n", list.size());

		System.out.println();
	}

	// 3.��������ݳ���
	private void accountIO(Scanner sc) {
		System.out.println();

		System.out.print("���¹�ȣ > ");
		String accountId = sc.nextLine();

		System.out.print("������½�����(yyyymmdd) > ");
		String iODate = sc.nextLine();

		System.out.println();
		System.out.printf("(%s)���� ���� ���%n", accountId);
		System.out.println("===========================================");
		System.out.println("���¹�ȣ / �ݾ� / ������� / ���� / �ܾ�");

		List<AccountHistory> list = this.dao.accountIOPrint(accountId, iODate);

		for (AccountHistory result : list) {
			System.out.println(result);
		}

		System.out.println("===========================================");
		System.out.printf("�� %d ��%n", list.size());

		System.out.println();
	}

	// 4. ��й�ȣ ����
	private void pwRevise(Scanner sc) {
		System.out.println();

		System.out.println("*��й�ȣ�� �����մϴ�*");

		System.out.print("���¹�ȣ > ");
		String accountId = sc.nextLine();

		System.out.print("������ ��й�ȣ > ");

		String pw = sc.nextLine();

		Account a = this.dao.accountId(accountId);

		a.setPw(pw);

		System.out.println("��й�ȣ ������ �Ϸ��Ͽ����ϴ�.");
		System.out.println();
	}
	
	
	public void serializable() {
		
		this.dao.serializable();
		
	}
	
	public void reSerializable() {
		this.dao.reSerializable();
	}

}
