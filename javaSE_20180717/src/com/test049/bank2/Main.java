package com.test049.bank2;

import java.util.*;

// ���� �޴� � Ŭ����
// ->main() �޼ҵ� ��� �ܿ� �߰� ����� �������� �ʴ´�.
public class Main {

	public static void main(String[] args) {

		// ���α׷� �ۼ� ����
		// 1. ȭ�� ����
		// 2. �ڷ��� Ŭ���� ����
		// 3. �׼� Ŭ���� ���� (����� �, �ܼ�)
		// 4. ���� �޴� ����
		// 5. ��� �׼� �ۼ� �� �׽�Ʈ
		// 6. �Է� �׼� �ۼ� �� �׽�Ʈ
		// 7. �߰� �׼� �ۼ� �� �׽�Ʈ

		SubMain sub = new SubMain();
		
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		
		System.out.println("*****Bank Application*****");

		while (flag) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------------");
			System.out.print("����> ");

			int selectNum = scanner.nextInt();
			scanner.nextLine();

			switch (selectNum) {
			case 1:
				sub.createAccount(scanner);
				break;
			case 2:
				sub.accountList();
				break;
			case 3:
				sub.deposit(scanner);
				break;
			case 4:
				sub.withdraw(scanner);
				break;
			case 5:
				flag = false;
			}

		}

		System.out.println("���α׷� ����");
		scanner.close();
	}

}
