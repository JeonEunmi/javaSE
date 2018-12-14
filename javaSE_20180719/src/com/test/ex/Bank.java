package com.test.ex;

import java.util.Scanner;

//�׼� Ŭ����
//->�ڷ� ����� ��ü � + ���� �޴��� �׼� �ڵ� �ۼ�.
public class Bank {
	
	//���(static final) �߰�
	public static final int MAX_BALANCE = 1000000;
	public static final int MIN_BALANCE = 0;
	
	//�ڷ� ����� ��ü ����
	private Account[] accountArray = new Account[10];

	//�迭 �ε��� ������ �ӽ� ����
	private int idx;
	
	//������ -> �ڷ� ����� �ʱ�ȭ
	public Bank(){
		this.accountArray[this.idx] = new Account("B0001", "HONG", 30000);
		++this.idx;
	}	
	//���»����ϱ� 
	public void createAccount(Scanner sc){

		System.out.println("=============");
		System.out.println("���»���");
		System.out.println("=============");

		System.out.println("���¹�ȣ : ");
		String ano = sc.nextLine();

		System.out.println("������ : ");
		String owner = sc.nextLine();

		System.out.println("�ʱ��Աݾ� : ");
		int balance = sc.nextInt();
		sc.nextLine();

		this.accountArray[this.idx] = new Account(ano, owner, balance);
		++this.idx;

		System.out.println("��� : ���°� �����Ǿ����ϴ�.");

	}


	//���¸�Ϻ���
	public void accountList(){

		System.out.println("=============");
		System.out.println("���¸��");
		System.out.println("=============");

		int count = 0;
		for(Account a : accountArray){
			if(a != null) {
				System.out.println(a.toString());
				++count;
			}
		}
		System.out.println("=============");
		System.out.println("�� " + count + "��");

		}

	//�����ϱ�
	public void deposit(Scanner sc){
		System.out.println("=============");
		System.out.println("�Ա�");
		System.out.println("=============");

		System.out.println("���¹�ȣ : ");
		String ano = sc.nextLine();

		System.out.println("�Աݾ� : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		Account tmp = this.findAccount(ano);

		if( money < Bank.MIN_BALANCE){
			System.out.println("�ּ� 0�� �Ա� ���");
		} else if( money > Bank.MAX_BALANCE){
			System.out.println("�ִ� 100�������� �Ա� ����");
		} else {
			tmp.setBalance(tmp.getBalance() + money);
			System.out.println("�Ա� ����");
		}

		System.out.println("���� �ܾ� : " + tmp.getBalance());
	}
	//����ϱ�
	public void withdraw(Scanner sc){
		System.out.println("=============");
		System.out.println("���");
		System.out.println("=============");

		System.out.println("���¹�ȣ : ");
		String ano = sc.nextLine();

		System.out.println("��ݾ� : ");
		int money = sc.nextInt();
		sc.nextLine();
		
		Account tmp = this.findAccount(ano);

		if( money < Bank.MIN_BALANCE){
			System.out.println("�ּ� 0�� ��� ���");
		} else if( money > Bank.MAX_BALANCE){
			System.out.println("�ִ� 100�������� ��� ����");
		} else if ( tmp.getBalance() - money < 0){
			System.out.println("�ܾ� ����");
		} else {
			tmp.setBalance(tmp.getBalance() - money);
			System.out.println("��� ����");
		}

		System.out.println("���� �ܾ� : " + tmp.getBalance());
	}

	//Account ��ü ã�� -> private method
	private Account findAccount(String ano){
	
		Account result = null;

		for(Account i : accountArray){
			if( i != null && i.getAno().equals(ano)) {
				result = i;
			}
		}

		return result;
	}

}
