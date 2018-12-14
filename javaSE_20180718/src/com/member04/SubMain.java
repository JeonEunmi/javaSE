package com.member04;

import java.util.*;
//���� �޴��� �׼� Ŭ���� ���� + ����� �
public class SubMain {
	
	// �ʵ� ���� -> MemberList Ŭ������ ��ü �غ�
	private MemberList memberList = new MemberList();
	
	//1. ȸ�������Է� �޴� �޼ҵ�
	
	public void join(Scanner sc) {
		
		// �ܺ� �Է��� �̿��ؼ� �̸�, ��ȭ��ȣ, �̸���, �������
		// ȸ����ȣ('M01' ����) -> �ڵ� ���� �׼� ó��
		String mid = this.memberList.autoMid();
		
		System.out.println();
		System.out.println("=============================================");
		
		// ȸ����ȣ, �̸�, ��ȭ��ȣ, �̸���, ����� ������ Member
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String callNum = sc.nextLine();
		System.out.print("�̸��� : ");
		String mail = sc.nextLine();
		System.out.print("����� : ");
		String registrationDate = sc.nextLine();
		
		//ȸ����ȣ, �̸�, ��ȭ��ȣ, �̸���, ����� ������ Member ��ü�� �����.
		Member m = new Member(mid, name, callNum, mail, registrationDate);
		
		this.memberList.join(m);
		
		//�޼������ "ȸ���� ��ϵǾ����ϴ�."
		System.out.println("ȸ���� ��ϵǾ����ϴ�.");
		
		System.out.println("=============================================");
		System.out.println();
			
		}
	
	//2. ȸ��������� �޴� �޼ҵ�
	public void memberOutput() {
		System.out.println();
		System.out.println("=======================================");
		System.out.println("             ȸ  ��  ��  ��            ");
		System.out.println("=======================================");
		// ȸ�������� ��ȯ�ϴ� �޼ҵ� ȣ��
		// -> �迭 �ڷ���
		// -> ���
		
		Member[] temp = this.memberList.memberOutput();
		int count = temp.length;
		
		System.out.println("�� " + count + "��");
		for(int i = 0; i < count; i++) {
			System.out.println(String.format("%s", temp[i]));			
		}
		System.out.println();
	}
	
	//3. ȸ�������˻� �޴� �޼ҵ�
	public void memberSearch(Scanner sc) {
		
		// ����޴� � �׼�
		// 1. �̸�����  2.��ȭ��ȣ���� 3.�̸��ϱ��� 4.�����(yyyy-mm) ���� 5.����
		System.out.println("=======================================");
		System.out.println("**ȸ���˻� �ý���**");
		
		boolean flag = true;
		
		while(flag) {
			System.out.println("1. �̸����� | 2.��ȭ��ȣ���� | 3.�̸��ϱ��� | 4. �����(yyyy-mm) ���� | 5.����");
			System.out.print("���� > ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
			
			//private method�� �����Ѵ�.
			case 1 :
				this.memberSearchName(sc);
				break;
			
			case 2 :
				this.memberSearchCallNum(sc);
				break;
			
			case 3 :
				this.memberSearchMail(sc);
				break;
				
			case 4 :
				this.memberSearchRegDate(sc);
				break;
				
			case 5 :
				flag = false;
				break;
				
			default : 
				break;
			}
			
		}
	}
	
	//private method �̸����ذ˻�
	
	private void memberSearchName(Scanner sc) {
		
		System.out.print("�̸� > ");
		String name = sc.nextLine();
		
		System.out.println();
		System.out.println("=======================================");
		
		Member[] temp = this.memberList.memberSearchName(name);
		
		System.out.println("�� " + temp.length + "��");
		
		if(temp.length == 0) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for(int i = 0; i < temp.length; i++) {
				System.out.println(String.format("%s", temp[i]));			
			}
		}
		
		System.out.println("=======================================");
		System.out.println();
		
	}
	private void memberSearchCallNum(Scanner sc) {
		
		System.out.print("��ȭ��ȣ> ");
		String callNum = sc.nextLine();
		
		System.out.println();
		System.out.println("=======================================");
		
		Member[] temp = this.memberList.memberSearchCallNum(callNum);
		
		if(temp.length == 0) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for(int i = 0; i < temp.length; i++) {
			System.out.println(String.format("%s", temp[i]));
			}
		}
		
		
		System.out.println("=======================================");
		System.out.println();
	
		}
	
	
	
	private void memberSearchMail(Scanner sc) {

		System.out.print("�����ּ� > ");
		String mail = sc.nextLine();
		
		System.out.println("=======================================");
		System.out.println();
	
		Member[] temp = this.memberList.memberSearchMail(mail);
		
		if(temp.length == 0) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for(int i = 0; i < temp.length; i++) {
			System.out.println(String.format("%s", temp[i]));
			}
		}
		
		System.out.println("=======================================");
		System.out.println();
	
		
		}
	
	private void memberSearchRegDate(Scanner sc) {

		System.out.print("����� (yyyy-mm) > ");
		String regDate = sc.nextLine();
		
		System.out.println();
		System.out.println("=======================================");
		
		Member[] temp = this.memberList.memberSearchRegDate(regDate);
		
		if(temp.length == 0) {
			System.out.println("�˻������ �����ϴ�.");
		} else {
			for(int i = 0; i < temp.length; i++) {
			System.out.println(String.format("%s", temp[i]));
			}
		}

		System.out.println("=======================================");
		System.out.println();
	}
	
	

}