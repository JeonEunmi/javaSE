package com.member01;

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
}
