package com.test.ex;

import java.util.*;

//���� �޴� � Ŭ����
public class Main {

	public static void main(String[] args) {
		//���� �޴� ����
		//1.���»��� 2.���¸�� 3.���� 4.��� 5.����
		Bank bank = new Bank();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		System.out.println("**Bank Application**");

		while(flag){
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			System.out.print("���� > ");

			int selectNum = 0;
			selectNum = sc.nextInt();
			sc.nextLine();

			switch(selectNum){
			case 1 : bank.createAccount(sc);
				break;
			case 2 : bank.accountList();
				break;
			case 3 : bank.deposit(sc);
				break;
			case 4 : bank.withdraw(sc);
				break;
			case 5 : flag = false;

			}
		}
		
		sc.close();
		System.out.println("���α׷�����");
	}

}
