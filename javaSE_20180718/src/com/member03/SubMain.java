package com.member03;

import java.util.*;
//���� �޴��� �׼� Ŭ���� ���� + ����� �
public class SubMain {
	
	// �ʵ� ���� -> ����� � -> ����� �迭 10��
	
	private Member[] memberArray = new Member[10];
	
	// ������ ���� -> �ʵ� �ʱ�ȭ
	
	private int idx;
	
	public SubMain() {
		memberArray[this.idx]= new Member("M01", "HONG", "010-2222-2222", "mail@do.com", "2018-07-18");
		++this.idx;
	}
	
	//1. ȸ�������Է� �޴� �޼ҵ�
	
	public void join(Scanner sc) {
		
		// �ܺ� �Է��� �̿��ؼ� �̸�, ��ȭ��ȣ, �̸���, �������
		// ȸ����ȣ('M01' ����) -> �ڵ� ���� �׼� ó��
		String mid = String.format("M%02d", this.idx + 1);
		
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
		
		// �迭 ����ҿ� Member ��ü ����
		
		this.memberArray[this.idx] = new Member(mid, name, callNum, mail, registrationDate); 
		
		// �ε��� ��ȣ 1 ����
		++this.idx;
		
		//�޼������ "ȸ���� ��ϵǾ����ϴ�."
		System.out.println("ȸ���� ��ϵǾ����ϴ�.");
		
		
		// ����ҹ迭 ����
		for(int i = 0; i < this.idx; ++i) {
			if(this.idx == memberArray.length) {
				this.extendArray(memberArray);
			}
			
		}
	}
	
	//2. ȸ��������� �޴� �޼ҵ�
	public void memberOutput() {
		System.out.println();
		System.out.println("=======================================");
		
		for(Member i : this.memberArray) {
			if(i != null) {
				System.out.println(i);
			}
		}
		System.out.println("�� " + this.idx + "��");
		System.out.println("=======================================");
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
	
	//private method - �迭 Ȯ��
	
	private void extendArray(Member[] member) {
		member = Arrays.copyOf(member, member.length + 10);
		this.memberArray = member;
		
		System.out.println();
		System.out.println("*****************  ��    ��  *****************");
		System.out.println("�迭 ����� �ʰ�. �ڵ����� 10�� ������ŵ�ϴ�.");
		System.out.println("**********************************************");
		System.out.println();
	}
	
	//private method �̸����ذ˻�
	
	private void memberSearchName(Scanner sc) {
		
		System.out.print("�̸� > ");
		String name = sc.nextLine();
		int count = 0;

		System.out.println();
		System.out.println("=======================================");
		for(int i = 0; i < this.idx; ++i) {
			if(this.memberArray[i].getName().equals(name)) {
				++count;
			} 
		}
		
		System.out.println("�� " + count + "��");

		if(count == 0){
			System.out.println("�˻� ��� �����ϴ�.");
		} else if(count > 0) {
			for(int i = 0; i < this.idx; ++i) {
				if(this.memberArray[i].getName().equals(name)) {
					System.out.println(this.memberArray[i]);
				} 
			}
			
		}
		/* ���2
		����� �������� ��� �޽��� ������Ų��.
		 else if(count > 0) {
			for(int i = 0; i < this.idx; ++i) {
				temp += String.format("%s%n",this.memberArray[i]);
			}
		}
		
		���3
		��� ������ ������ private method�� ���� ����
		*/
		System.out.println("=======================================");
		System.out.println();
		
	}
	private void memberSearchCallNum(Scanner sc) {
		
		System.out.print("��ȭ��ȣ> ");
		String callNum = sc.nextLine();
		int count = 0;

		System.out.println();
		System.out.println("=======================================");
		
		for(int i = 0; i < this.idx; i++) {
			if(this.memberArray[i].getCallNum().indexOf(callNum) != -1) {
				++count;
			}
		}
		
		System.out.println("�� " + count + "��");
		
		//�迭 ����ҿ��� ��ȭ��ȣ �׸��� (�κ�) ��ġ�ϴ� �ڷḸ ���
		if(count == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(int i = 0; i < this.idx; i++) {
				if(this.memberArray[i].getCallNum().indexOf(callNum) != -1) {
					System.out.println(this.memberArray[i]);
				}
			}			
		}
		
		System.out.println("=======================================");
		System.out.println();
	
		}
	
	
	
	private void memberSearchMail(Scanner sc) {

		System.out.print("�����ּ� > ");
		String mail = sc.nextLine();
		int count = 0;

		for(int i = 0; i < this.idx; i++) {
			if(this.memberArray[i].getMail().indexOf(mail) != -1) {
				++count;
			}
		}
		
		System.out.println("�� " + count + "��");
		
		//�迭 ����ҿ��� ��ȭ��ȣ �׸��� (�κ�) ��ġ�ϴ� �ڷḸ ���
		if(count == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(int i = 0; i < this.idx; i++) {
				if(this.memberArray[i].getMail().indexOf(mail) != -1) {
					System.out.println(this.memberArray[i]);
				}
			}			
		}
		
		System.out.println("=======================================");
		System.out.println();
	
		}
	
	private void memberSearchRegDate(Scanner sc) {

		System.out.print("����� (yyyy-mm) > ");
		String regDate = sc.nextLine();
		int count = 0;

		System.out.println();
		System.out.println("=======================================");
		for(int i = 0; i < this.idx; ++i) {
			if(this.memberArray[i].getRegistrationDate().substring(0, 7).equals(regDate)) {
				++count;
			} 
		}
		
		System.out.println("�� " + count + "��");

		if(count == 0){
			System.out.println("�˻� ��� �����ϴ�.");
		} else if(count > 0) {
			for(int i = 0; i < this.idx; ++i) {
				if(this.memberArray[i].getRegistrationDate().substring(0, 7).equals(regDate)) {
					System.out.println(this.memberArray[i]);
				} 
			}
			
		}
		System.out.println("=======================================");
		System.out.println();
	}
	
	

}