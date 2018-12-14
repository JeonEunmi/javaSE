package com.bankAccount.main;

import java.util.Scanner;

import com.bankAccount.persistance.AccountDAO;
import com.bankAccount.service.AdminSubMain;
import com.bankAccount.service.OwnerSubMain;

// ���� Ŭ����
public class Main {

	/*
	 * - ������ȸ, �����Ա�, ������� ��� ���� - ������ ����������, ��������, �ŷ����� ���� ���� - ������ ���������� �̸�, ��ȭ��ȣ��
	 * ���� - ���������� ���¹�ȣ, �����ܾ�, ���»�����, ��й�ȣ, �������ŷ��Ϸ� ���� - �ŷ������� ���¹�ȣ, ����ݾ�, �������,
	 * ����ݱ���, �ܾ����� ���� - ������ ���� ȭ�� ����. ����� ȭ�鿡�� �޴���ȣ�� �ƴ� Ư����ȣ �Է½� ������ ȭ������ �̵� ����. -
	 * ������ ���� ȭ�鿡�� ���»���, ��ü������ȸ �� ����ݳ��� ��� ��� - ����ȭ/������ȭ ��� ����
	 */

	// ���� �޴� ����
	// 1.������ȸ 2.�����Ա� 3.������� 4.����
	// -> ������������ 99���� ������� �ʴ´�.
	public static void main(String[] args) {

		// ���θ޴�
		// 1.������ȸ 2.�����Ա� 3.������� 4.����
		// -> ������ ���� �޴�(99)�� ȭ��� ������� �ʴ´�.

		Scanner sc = new Scanner(System.in);
		// ����)
		// Main Ŭ���� main() �޼ҵ忡�� ��ü ������ AccountDAO��
		// SubMain ��ü�� AdminSubMain ��ü�� ���޽��Ѽ� ������ �ǵ��� �Ѵ�.
		AccountDAO dao = new AccountDAO();

		OwnerSubMain sub = new OwnerSubMain(dao);
		AdminSubMain adminSub = new AdminSubMain(dao);

		while (true) {
			try {
				// ���� �޴� ����
				System.out.println();
				System.out.println("**���°��� v1.0**");
				System.out.println("1.������ȸ 2.�����Ա� 3.������� 4.����");
				System.out.print("����>");

				int m = sc.nextInt();
				sc.nextLine();

				if (m == 4 || m == 0) {
					// ����ȭ ����
					sub.serializable();
					adminSub.serializable();
					break;
				}

				// switch~case ������ �̿��� �޴� ����
				switch (m) {
				case 1:
					sub.accountSearch(sc);
					break;
				case 2:
					sub.accountIn(sc);
					break;
				case 3:
					sub.accountOut(sc);
					break;
				case 99:
					new AdminSubMain(dao).main(sc);
					break;
				default:
					System.out.println("�߸��� �޴� �����Դϴ�.");
					break;
				}

			} catch (Exception e) {
				System.out.println("�߸��� �׼��Դϴ�.");
				sc.nextLine();
				// e.printStackTrace();
			}

		}

		sc.close();
		
		
		System.out.println("���α׷� ����.");
		
		

	}

}
